package command2remote;

import java.util.*;

//
// This is the invoker
//
public class RemoteControl {
    //RemotControl will handle Seven on/off
	private Command[] onCommands;
	private Command[] offCommands;
 
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
 
                //initialize Arrays
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
  
        //take a slot position and on/off command to be
        //stored in that slot
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
 
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
  
        @Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
