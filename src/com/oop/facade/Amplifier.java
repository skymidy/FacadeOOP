package com.oop.facade;

public class Amplifier {

    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }

    public void setVolume(int value) {
        System.out.println(this + ": volume set to " + value + "%");
    }
}
