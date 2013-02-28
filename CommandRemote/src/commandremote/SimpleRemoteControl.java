package commandremote;

import java.util.*;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;//one "slot" which will be controll one
        //device
 
	public SimpleRemoteControl() {}
 
        //setting the Command obj.
	public void setCommand(Command command) {
		slot = command;
	}
 
        //execute method from Command obj
	public void buttonWasPressed() {
		slot.execute();
	}
}
