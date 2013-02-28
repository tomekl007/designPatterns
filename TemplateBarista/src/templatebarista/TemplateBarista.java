/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatebarista;

/**
 *
 * @author Tomek
 */
public class TemplateBarista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		//TeaWithHook teaHook = new TeaWithHook();
		//CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		//System.out.println("\nMaking tea...");
		//teaHook.prepareRecipe();
 
//		System.out.println("\nMaking coffee...");
//		coffeeHook.prepareRecipe();
    }
}
