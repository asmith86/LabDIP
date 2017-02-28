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
public class GUIOutMessager implements OutputMessager {
    private String outputMsg;
    private String promptMsg;
    
    GUIOutMessager(String promptMsg){
        this.setPromptMsg(promptMsg);
    }

    public final String getOutputMsg() {
        return outputMsg;
    }

    public final void setOutputMsg(String outputMsg) {
        if (null == outputMsg || outputMsg.isEmpty()){
            throw new IllegalArgumentException("Invalid GUI Message.");
        }
        this.outputMsg = outputMsg;
    }

    public final String getPromptMsg() {
        return promptMsg;
    }

    public final void setPromptMsg(String promptMsg) {
        if (null == promptMsg || promptMsg.isEmpty()){
            throw new IllegalArgumentException("Invalid GUI Message.");
        }
        this.promptMsg = promptMsg;
    }

    @Override
    public void promptForInput() {
      JOptionPane.showMessageDialog(null,this.getPromptMsg());
    }

    @Override
    public void createOutputMessage(String msg) {
        this.setOutputMsg(msg);
    }

    @Override
    public void outputMessage() {
         JOptionPane.showMessageDialog(null,this.getOutputMsg());
    }
    
    
}
