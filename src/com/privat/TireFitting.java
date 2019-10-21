package com.privat;

public class TireFitting {
private  void removeTheWheel()
{
    System.out.println("removeTheWheel");
}
    private  void fixWheel() {
        System.out.println("fixWheel");
    }
    private boolean checkQuality() {
        boolean qualityRes;
        double b = Math.random();
    b = Math.round(b);
    if ( b == 1)
    {
        System.out.println("checkQuality");
        qualityRes = true;
    }
    else  qualityRes = false;
    return qualityRes;
    }
    private void installWheel(){
        System.out.println("installWheel");
    }
    public void makeService() {
        //System.out.println("Все этапы замены колеса");
        removeTheWheel();
        fixWheel();
        boolean qualityRes = checkQuality();
        while (!qualityRes) {
            removeTheWheel();
            fixWheel();
            qualityRes = checkQuality();
        }
        installWheel();
        System.out.println("Все четыре этапа замены колеса пройдены.");

    }
}
