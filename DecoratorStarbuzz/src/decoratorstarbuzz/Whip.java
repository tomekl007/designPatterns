package decoratorstarbuzz;
 
import decoratorstarbuzz.Beverage;
import decoratorstarbuzz.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	
	public double cost() {
		return .10 + beverage.cost();
	}
        
     public String getDescription() {
		return beverage.getDescription() + " size : "+ beverage.getSize()  + ", Whip size : " + this.getSize()  ;//get descirpion from beverage we are wrapping and add "Mocha"
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
