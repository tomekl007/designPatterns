package decoratorstarbuzz;

import decoratorstarbuzz.Beverage;

//Mocha is decorator
public class Mocha extends CondimentDecorator {
	Beverage beverage;//instance variable to hold the beverage we are wrapping
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;//set instance variable to the object we are wrapping
                //we will pass the beverage we are wrapping to constructor
	}
 
	public String getDescription() {
		return beverage.getDescription() + " size : "+ beverage.getSize()  + ", Mocha";// size : " + this.getSize()  ;//get descirpion from beverage we are wrapping and add "Mocha"
	}
 
	public double cost() {
		return .20 + beverage.cost();
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
