package com.company;

public class Radiostation {
    String name;
    float frequency;
    String format;

    public static  void main (String[] args)
    {
        Radiostation Europaplus = new Radiostation();
        Europaplus.name="Europa";
        Europaplus.frequency=103.3f;
        Europaplus.format="POP";

        playSong();
        onAir();
        startAd(" sting",3);

    }
    public static void playSong()
    {
        System.out.println("playSong");
    }
    public static void onAir()
    {
        System.out.println("onAir");
    }
    public static void startAd(String Song,int t)
    {   String[] song = new String[10];
        song[t] = Song;
        System.out.println("startAd" + song[t]);
    }


}
