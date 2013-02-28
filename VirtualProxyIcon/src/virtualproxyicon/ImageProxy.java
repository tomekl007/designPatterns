package virtualproxyicon;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ImageProxy implements Icon {
	ImageIcon imageIcon;//real icon which will be dispalayed
        //when will be loaded
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
     
	public ImageProxy(URL url) { imageURL = url; }
     
	public int getIconWidth() {
		if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
			return 800;
		}
	}
 
	public int getIconHeight() {
		if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
			return 600;
		}
	}
     
        
        //called when is time to pain icon on the screen
	public void paintIcon(final Component c, Graphics  g, int x,  int y) {
		if (imageIcon != null) { //if we had icon, tell it to paint itself
			imageIcon.paintIcon(c, g, x, y);
		} else {
                    //otherwise dipaley loading message
			g.drawString("Loading CD cover, please wait...", x+300, y+190);
			if (!retrieving) {
				retrieving = true;

                                //to not hang entire user interface, we need
                                //another thread to retrive image
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
                                           //instantiate icon object.Constructor will
                                           //not return until image is loaded
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}
}
