/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facadetheater;

/**
 *
 * @author Tomek
 */
public class FacadeTheater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create obj.
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
 
                //passed to facade
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, 
						projector, screen, lights, popper);
 
                //and now i can use simply method from facade
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
    }
}
