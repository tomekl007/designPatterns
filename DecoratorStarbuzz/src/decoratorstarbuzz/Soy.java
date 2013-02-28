package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + " size : "+ beverage.getSize()  + ", Soy size : " + this.getSize()  ;
	}

	public double cost() {
		return .15 + beverage.cost();
	}
        
          @Override
      public int getSize() {
        return this.size;
              //return 0;
    }
        
          @Override
          public void setSize(int s){
              
              this.size = s;
          }
}
