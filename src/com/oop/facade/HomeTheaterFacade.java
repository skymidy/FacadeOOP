package com.oop.facade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private CDPlayer cdPlayer;
    private DVDPlayer dvdPlayer;
    private PopcornPopper popcornPopper;
    private Projector projector;
    private Screen screen;
    private TheaterLights theaterLights;
    private Tuner tuner;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.popcornPopper = new PopcornPopper();
        this.screen = new Screen();
        this.theaterLights = new TheaterLights();

        this.tuner = new Tuner(this.amplifier);
        this.dvdPlayer = new DVDPlayer(this.amplifier);
        this.cdPlayer = new CDPlayer(this.amplifier);

        this.projector = new Projector(this.dvdPlayer);
    }

    public void watchMovie() {
        theaterLights.on();
        amplifier.on();
        dvdPlayer.on();
        popcornPopper.on();
        screen.down();
        projector.on();

        dvdPlayer.setDVD("Star Wars episode III");
        theaterLights.dim();
        amplifier.setVolume(60);
        dvdPlayer.play();
        popcornPopper.pop();
        popcornPopper.pop();
        popcornPopper.pop();
    }

    public void stopMovie() {
        theaterLights.on();
        dvdPlayer.pause();
        dvdPlayer.eject();

        amplifier.setVolume(0);
        amplifier.off();
        dvdPlayer.off();

        popcornPopper.off();
        projector.off();

        screen.up();
    }

    public void listenToCD() {
        amplifier.on();
        cdPlayer.on();

        cdPlayer.setDVD("Blood, Sweat, and Pixels: The Triumphant, Turbulent Stories Behind How Video Games Are Made");
        amplifier.setVolume(60);

        cdPlayer.play();
    }

    public void stopCD() {
        cdPlayer.pause();
        cdPlayer.eject();

        amplifier.setVolume(0);
        amplifier.off();
        cdPlayer.off();
    }
    public void listenToRadio(){
        amplifier.on();
        tuner.on();

        tuner.setFM(109.9f);
        amplifier.setVolume(60);
    }
    public void stopRadio()
    {
        amplifier.setVolume(0);
        amplifier.off();
        tuner.off();
    }
}
