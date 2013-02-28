package commandremote;

public class LightOnCommand implements Command {
	Light light;
  
        //to constructor is passed specyfic object(Light)
        //that command is going to control
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
            //execute command call on method on obj.
            //receive in constructor
		light.on();
	}
}
