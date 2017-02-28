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
public class ConsoleOutMessager implements OutputMessager {
    private String outputMsg;
    private String promptMsg;
    
    ConsoleOutMessager(String promptMsg){
        
        this.setPromptMsg(promptMsg);
    }

    public final String getOutputMsg() {
        return outputMsg;
    }

    public final void setOutputMsg(String outputMsg) {
        if (null == outputMsg || outputMsg.isEmpty()) {
            throw new IllegalArgumentException("Invalid Console Output Message.");
        }
        this.outputMsg = outputMsg;
    }

    public final String getPromptMsg() {
        
        return promptMsg;
    }

    public final void setPromptMsg(String promptMsg) {
        if (null == promptMsg || promptMsg.isEmpty()){
            throw new IllegalArgumentException("Invalid Console Prompt.");
        }
        this.promptMsg = promptMsg;
    }
    
    //maybe not have properties and just pass in the messages.

    @Override
    public final void promptForInput() {
        System.out.println(this.getPromptMsg());
    }

    @Override
    public final void outputMessage() {
        System.out.println("Console output: " + this.getOutputMsg());
    }

    @Override
    public void createOutputMessage(String msg) {
        this.setOutputMsg(msg);
    }
    
}
