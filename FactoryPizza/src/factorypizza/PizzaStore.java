/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypizza;

/**
 *
 * @author Tomek
 */
public class PizzaStore {
    //reference to simplePizzaFactory
	SimplePizzaFactory factory;
 
        //passed simplePizzaFactory to constructor
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
                //invoke createPizza method in factory
		pizza = factory.createPizza(type);//i operate on 
                //abstract class, not on implementation
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
