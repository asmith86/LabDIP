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
public class TipCalculatorService {
    private TipCalculator tipCalculator;
    
    public TipCalculatorService(TipCalculator tipCalculator){
        setTipCalculator(tipCalculator);
    }

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }
    
    public final double getTip(){
        return this.tipCalculator.getTip();
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    
}
