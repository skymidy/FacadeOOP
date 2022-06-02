package com.oop.facade;

public class TheaterLights {
    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }

    public void dim() {
        System.out.println(this + ": dim");
    }
}
