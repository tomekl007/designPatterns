/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypizza;

/**
 *
 * @author Tomek
 */
public class SimplePizzaFactory {

    //createPizza method will be used by all Client who wants 
    //instantiate pizza
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
