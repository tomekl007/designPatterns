/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commandremote;

/**
 *
 * @author Tomek
 */
public class CommandRemote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = 
		    new GarageDoorOpenCommand(garageDoor);
 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
}
