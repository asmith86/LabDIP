/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Alex
 */
public class Startup {

    public static void main(String[] args) {

      
        String promptMsg = "Please enter a message for output.";

        MessagingService messager = new MessagingService(
                new ConsoleInMessager(),
                new GUIOutMessenger(promptMsg)
        );
        
        messager.promptForInput();
        messager.outputMessage();
    }
}
