package com.oop.facade;

public class Main {

    public static void main(String[] args) {
	    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.stopMovie();
        homeTheaterFacade.listenToCD();
        homeTheaterFacade.stopCD();
        homeTheaterFacade.listenToRadio();
        homeTheaterFacade.stopRadio();
    }

}
