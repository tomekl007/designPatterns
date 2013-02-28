/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterducksturkey;

/**
 *
 * @author Tomek
 */
public class AdapterDucksTurkey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     		MallardDuck duck = new MallardDuck();
 
		WildTurkey turkey = new WildTurkey();
                //wrap turkey to TurkeyAdapter which 
                //meka turkey look like Duck
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
   
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
 
		System.out.println("\nThe Duck says...");
		testDuck(duck);
  
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
 
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
