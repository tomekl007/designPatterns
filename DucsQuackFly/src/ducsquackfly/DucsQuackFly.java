/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducsquackfly;

/**
 *
 * @author Tomek
 * this is written with strategy pattern 
 */
public class DucsQuackFly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Duck mallard = new MallardDuck();
      mallard.performQuack();
      mallard.performFly();
      
      Duck model = new ModelDuck();
      model.setFlyBehavior(new FlyWithWings());
      model.performFly();
      
    }
    
    
}
