/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdeejay;

/**
 *
 * @author Tomek
 */
public class MVCdeejay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BeatModelInterface model = new BeatModel();
       ControllerInterface controller = new BeatController(model);
    }
}
