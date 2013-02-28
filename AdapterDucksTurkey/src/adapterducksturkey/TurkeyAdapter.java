package adapterducksturkey;

//first i must implement interface(Duck)
//of the type i am adapting to
//this is interface which client expect to see
public class TurkeyAdapter implements Duck {//i can create two
    //way adapter that support two interfaces. Just implements
    //both interfaces,so adapter can act as one or another
	Turkey turkey;
 
        //get reference to obj. which i be adapting
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    //implements all methods of interface Duck
	public void quack() {
            //inside of implement method, i can invoke method
            //from interface Turkey
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
