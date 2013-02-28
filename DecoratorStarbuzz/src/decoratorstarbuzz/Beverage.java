/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorstarbuzz;

/**
 *
 * @author Tomek
 */
public abstract class Beverage {
	public String description = "Unknown Beverage";
      public int size;
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
        
       public int getSize(){
           return size;
       }
        
      public void setSize(int s){
          this.size = s;
      }
              
        
}
