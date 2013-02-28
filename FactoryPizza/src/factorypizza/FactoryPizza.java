/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypizza;

/**
 *
 * @author Tomek
 * 
 * THIS IS SIMPLE FACTORY PATTER
 */



public class FactoryPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
