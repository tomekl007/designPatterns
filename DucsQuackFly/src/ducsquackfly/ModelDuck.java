/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducsquackfly;

/**
 *
 * @author Tomek
 */
public class ModelDuck extends Duck {
    
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    
     public void display(){
        System.out.println("I`am Model Duck");
        
    }
    
    
}
