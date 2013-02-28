/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorstarbuzz;

//import decoratorstarbuzz.Espresso;




/**
 *
 * @author Tomek
 */
public class DecoratorStarbuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(2);
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost() + " size :" + beverage.getSize());
 
             
		Beverage beverage2 = new DarkRoast(1);//make an darkRost obj
		//beverage2.setSize(0);
             beverage2 = new Mocha(beverage2);//wrap it with Mocha
             beverage2.setSize(8);
		beverage2 = new Mocha(beverage2);//wrap it with  second Mocha
                beverage2.setSize(0);
		beverage2 = new Whip(beverage2);//wrap it with Whip
                beverage2.setSize(2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
    }

