/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratoriostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Tomek
 */
public class DecoratorIOStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int c;

		try {
			InputStream in = 
                                //setUp a FileInputStream and decorate it first with BufferedInputStream
                                //second with our implementation : LowerCaseInputStream
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("Test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
