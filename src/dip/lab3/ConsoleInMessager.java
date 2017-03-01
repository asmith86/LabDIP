/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class ConsoleInMessager implements InputMessager{
    private final Scanner key;
    
   public ConsoleInMessager(){
        this.key = new Scanner(System.in);
    }

    @Override
    public final String inputMessage() {
        
       return key.nextLine();
    }
    
    
    
    
}
