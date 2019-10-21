package com.heroes.peoples;

import com.heroes.mutants.Spiderman;
import java.lang.reflect.Method;

public class IronMan {
    public void usePower() throws Exception{

        Spiderman spiderman = new Spiderman();
        Method m = Spiderman.class
                .getDeclaredMethod("shootWithCobwebs");
        m.setAccessible(true);
        m.invoke(spiderman);
    }


}

