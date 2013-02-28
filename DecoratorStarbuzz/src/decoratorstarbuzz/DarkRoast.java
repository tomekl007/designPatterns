package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast(int size) {
		description = "Dark Roast Coffee";
                this.size = size;
	}
 
	public double cost() {
		return .99;
	}
        
        
}

