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
public class FoodServiceTipCalculator implements TipCalculator {
    private double billAmt;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality servicequality;

    public FoodServiceTipCalculator(double billAmt, ServiceQuality serviceQuality){
        this.setBillAmt(billAmt);
        this.setServiceQuality(serviceQuality);
    }

    @Override
    public double getGoodTip() {
        return goodTip;
    }

    @Override
    public void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public double getFairTip() {
        return fairTip;
    }

    @Override
    public void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public double getPoorTip() {
        return poorTip;
    }

    @Override
    public void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }
    
    
    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
    }

    @Override
    public ServiceQuality getQ() {
        return servicequality;
    }

   
    
    @Override
    public final double getTip(){
        double tip = 0.0;
        
        switch(servicequality){
            case GOOD:
                tip = billAmt * this.goodTip;
                break;
            case FAIR:
                tip = billAmt * this.fairTip;
                break;
            case POOR:
                tip = billAmt * this.poorTip;
                break;
                
        }
        return tip;
    }

    private void setServiceQuality(ServiceQuality serviceQuality) {
        this.servicequality = serviceQuality; //To change body of generated methods, choose Tools | Templates.
    }
}
