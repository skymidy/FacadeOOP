package com.oop.facade;

public class CDPlayer {
    private Amplifier amplifier;

    public CDPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }

    public void play() {
        System.out.println(this + ": playing");
    }

    public void pause() {
        System.out.println(this + ": on pause");
    }

    public void setDVD(String value) {
        System.out.println(this + ": CD set to " + value);
    }

    public void eject() {
        System.out.println(this + ": CD ejected");
    }
}
