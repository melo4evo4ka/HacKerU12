package com.company;

public class Math {
    String str;
    public static void main(String[] args) {
    String result;
        System.out.println(convertToInteger("56"));
    result = compareInteger(2,1);
        System.out.println(result);
    }

    public static Integer convertToInteger(String value) {
        return Integer.parseInt(value);
    }

    public static String compareInteger(Integer value1, Integer value2)
    {
        String str="df";
        int t=value1.compareTo(value2);
        if (t == 0)
            str = "Равно";
            //System.out.println("Равно");
        if (t == -1)
            str = "Больше";
            //System.out.println("Больше");
        if (t == 1)
            str = "Меньше";
            //System.out.println("Меньше");
        return str;
        }
}
