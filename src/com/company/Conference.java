package com.company;

public class Conference {
    String topic;
    static int period;
    static Conference CONST_CONFERENCE = new Conference();

    public Conference() {
      //  topic= "TOPIC FD";
    }

    public Conference(String topic) {
        this.topic = topic;
    }

    public void showTopic(){
        System.out.println(this.topic);
    }
    static void showPeriod()
    {
        System.out.println(period);
    }

    static Conference itConference() {
        if (CONST_CONFERENCE == null) {
            CONST_CONFERENCE = new Conference();
        }
        return CONST_CONFERENCE;
    }



    public static void main(String[] args) {
        Conference.period=10;
        showPeriod();
        Conference medicalConference = new Conference();
        medicalConference.topic="dfdsfsdfsfsd";
        medicalConference.showTopic();
        Conference itConference = new Conference();
        itConference();
        itConference.showTopic();

    }
}
