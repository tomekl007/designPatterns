package stategumball;


//i can use abstract class, this gives me possibility
//to add extra methods, without breaking concrete state
//implementations
public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
