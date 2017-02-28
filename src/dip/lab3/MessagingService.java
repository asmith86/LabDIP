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
public class MessagingService {
    private InputMessager input;
    private OutputMessager output;
    
    MessagingService(InputMessager input, OutputMessager output){
        this.setInput(input);
        this.setOutput(output);
    }

    public final InputMessager getInput() {
        return input;
    }

    public final void setInput(InputMessager input) {
        if (null == input){
            throw new IllegalArgumentException("Did not provide an Input Messager.");
        }
        this.input = input;
    }

    public final OutputMessager getOutput() {
        return output;
    }

    public final void setOutput(OutputMessager output) {
        if (null == input){
            throw new IllegalArgumentException("Did not provide an Output Messager.");
        }
        this.output = output;
    }
    
    public final String inputMessage(){
        return this.input.inputMessage();
    }
    
    public final void promptForInput(){
        this.output.promptForInput();
    }
    
    public final void outputMessage(){
        this.output.createOutputMessage(this.inputMessage());
        this.output.outputMessage();
    }
}
