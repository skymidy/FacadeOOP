package com.oop.facade;

public class PopcornPopper {
    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }

    public void pop() {
        System.out.println(this + ": pop pop");
    }
}
