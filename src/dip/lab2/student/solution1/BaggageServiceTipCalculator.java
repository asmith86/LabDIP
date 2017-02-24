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
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseRate;
    private int bagCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality servicequality;

    public BaggageServiceTipCalculator(double baseRate, int bagCount, ServiceQuality serviceQuality){
        this.setBaseRate(baseRate);
        this.setServiceQuality(serviceQuality);
        this.setBagCount(bagCount);
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public ServiceQuality getServicequality() {
        return servicequality;
    }

    public void setServicequality(ServiceQuality servicequality) {
        this.servicequality = servicequality;
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
    
    
    public final double getBaseRate() {
        return baseRate;
    }

    public final void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
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
                tip = baseRate * this.bagCount * this.goodTip;
                break;
            case FAIR:
                tip = baseRate * this.bagCount * this.fairTip;
                break;
            case POOR:
                tip = baseRate * this.bagCount * this.poorTip;
                break;
                
        }
        return tip;
    }

    private void setServiceQuality(ServiceQuality serviceQuality) {
        this.servicequality = serviceQuality; 
    }
}
