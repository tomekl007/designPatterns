package adapteriteratorenumerator;

import java.util.*;

//we adapting Ecumeration to Iterator, so we must
//implement Iterator inteface
public class EnumerationIterator implements Iterator {
	Enumeration enumeration;
 
	public EnumerationIterator(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
 
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
 
	public Object next() {
		return enumeration.nextElement();
	}
 
        //throw excepiton because Enumerator dont have such method
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
