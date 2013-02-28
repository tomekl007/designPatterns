/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adapteriteratorenumerator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Tomek
 */
public class AdapterIteratorEnumerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector v = new Vector(Arrays.asList(args));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
                    //it throws exception, 
                  iterator.remove();
			System.out.println(iterator.next());
    }
}
}
