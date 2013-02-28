package factory3pizza;


public interface PizzaIngredientFactory {
 
    
    //for each ingredient we define a create method in our
    //intefface
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
