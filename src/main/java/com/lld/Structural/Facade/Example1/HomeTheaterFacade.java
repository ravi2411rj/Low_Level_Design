package com.lld.Structural.Facade.Example1;

public class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvd.on();
        projector.on();
        projector.setInput("DVD");
        sound.on();
        sound.setVolume(5);
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        dvd.off();
        projector.off();
        sound.off();
    }
}
