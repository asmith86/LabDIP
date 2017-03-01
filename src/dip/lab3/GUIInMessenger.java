/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class GUIInMessenger implements InputMessenger {

    @Override
    public final String inputMessage() {
     
      return JOptionPane.showInputDialog(null, "Enter Response: ");
    }
    
}
