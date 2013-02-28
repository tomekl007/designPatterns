package headfirst.singleton.dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
//volatile keyword ensures that multiple threads handle
//uniqueInstance variable correctly when it beeing 
//initialized to the singleton instance

//volatile -synchronization happend Whenever a volatile variable is accessed.
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {//check if there is no instance
		//then enter synchronized block
			synchronized (Singleton.class) {//we only synchronize first time
				if (uniqueInstance == null) {//check again if still null:
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
