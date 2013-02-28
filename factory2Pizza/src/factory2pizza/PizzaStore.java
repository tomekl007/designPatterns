/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory2pizza;

/**
 *
 * @author Tomek
 */

//each sublcass of PizzaStore overrides createPizza method
//while all sublcasses make use of orderPizza mehod
//define in superclass PizzaStore
public abstract class PizzaStore {
 
    
    
    //Factory method is abstract, returns Obj(Pizza) that is used in method in superclass(PizzaStore)
    //Isolates client from knowing what kind of concrete obj is actually created
    //may be parametized to choose amogn several variaton subclass of obj(Pizza) 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
            //now createPizza is back in PIzzaStore rather than in PizzaStoreFactory
		Pizza pizza = createPizza(type);//orderPizza method has no clue
                //which pizza is really creating
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
