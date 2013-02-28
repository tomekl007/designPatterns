package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}

//    @Override
//    public int getSize() {
//        return size;
//    }

//    @Override
//    public void setSize(int size) {
//        this.size = size;
//       
//    }
}

