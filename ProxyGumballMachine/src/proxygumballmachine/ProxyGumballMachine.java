/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proxygumballmachine;

import java.rmi.Naming;

/**
 *
 * @author Tomek
 */
public class ProxyGumballMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
 			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);

			gumballMachine = 
				new GumballMachine(args[0], count);
                   //call of naming.rebind publishes the gumballMchine
                   //stub under the name gumballMachine
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
