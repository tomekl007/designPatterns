/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package command2remote;

/**
 *
 * @author Tomek
 */

//example of null object. Is useful when you dont have 
//a meaningful obj. to return, and yet you want to remove 
//the responsibility to handling null from the client
public class NoCommand implements Command{

    @Override
    public void execute() {
        
    }
    
}
