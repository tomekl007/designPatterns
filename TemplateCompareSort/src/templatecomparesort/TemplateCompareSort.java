/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templatecomparesort;

import java.util.Arrays;

/**
 *
 * @author Tomek
 */
public class TemplateCompareSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
		Duck[] ducks = { 
						new Duck("Daffy", 8), 
						new Duck("Dewey", 2),
						new Duck("Howard", 7),
						new Duck("Louie", 2),
						new Duck("Donald", 10), 
						new Duck("Huey", 2)
		 };

		System.out.println("Before sorting:");
		display(ducks);

		Arrays.sort(ducks);
 
		System.out.println("\nAfter sorting:");
		display(ducks);
	}

	public static void display(Duck[] ducks) {
		for (int i = 0; i < ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}
}

