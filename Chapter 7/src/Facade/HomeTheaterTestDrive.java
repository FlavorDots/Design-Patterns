package Facade;

public class HomeTheaterTestDrive {
    static Amplifier amp = new Amplifier("Amplifier");
    static Tuner tuner = new Tuner("AM/FM Tuner", amp);
    static StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
    static CdPlayer cd = new CdPlayer("CD Player", amp);
    static Projector projector = new Projector("Projector", player);
    static TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    static Screen screen = new Screen("Theater Screen");
    static PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, player, projector, screen,
                lights, popper);

        homeTheaterFacade.watchMovie("Raiders fo the Lost ark");
        homeTheaterFacade.endMovie();
    }




}
