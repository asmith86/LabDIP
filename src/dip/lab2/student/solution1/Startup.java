/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author asmith86
 */
public class Startup {

    public static void main(String[] args) {
        // Always perform initialization of worker objects first
        TipCalculator calc
                = new BaggageServiceTipCalculator(1, 5, ServiceQuality.GOOD);

        TipCalculatorService service = new TipCalculatorService(calc);

        double tip = service.getTip();
        
        System.out.println(tip);

    }

}
