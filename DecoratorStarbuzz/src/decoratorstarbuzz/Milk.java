package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk ";
	}

	public double cost() {
		return .10 + beverage.cost();
	}

    @Override
    public int getSize() {
        return this.getSize();
    }
}
