package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {//to be interchangable with Beverage
	public abstract String getDescription();//reimplement getDesctription method
        public abstract int getSize();
}
