package compositemenu;

 
import java.util.*;

//s 369
  
public class CompositeIterator implements Iterator {
	Stack stack = new Stack();
   
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
   
        
	public Object next() {
            int i = 0;
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if (component instanceof Menu) {
                            //jesli jest typem Menu to push na stack iterator po tym menu
				stack.push(component.createIterator());
			} 
                        System.out.printf("iterator next will return component nr :" + i);
                        i++;
                    //jeśli nie to znaczy że jest ItemMenu
			return component;
		} else {
			return null;
		}
	}
  
        
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if (!iterator.hasNext()) {//jesli hasNext return false(stack.empty)
                            
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
   
	public void remove() {
		throw new UnsupportedOperationException();
	}
}


