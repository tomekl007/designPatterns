/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory3pizza;

/**
 *
 * @author Tomek
 * using Factory Method Pattern and Abstract Factory Pattern
 * 
 */
public class Factory3Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PizzaStore nyStore = new NYPizzaStore();
		//PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
//		pizza = chicagoStore.orderPizza("cheese");
//		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
//		pizza = chicagoStore.orderPizza("clam");
//		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
//		pizza = chicagoStore.orderPizza("pepperoni");
//		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
//		pizza = chicagoStore.orderPizza("veggie");
//		System.out.println("Joel ordered a " + pizza + "\n");
    }
}
