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
public class BartenderServiceTipCalculator implements TipCalculator {
    private double amtPerDrink;
    private int drinkCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality servicequality;

    public BartenderServiceTipCalculator(double amtPerDrink, int drinkCount){
        this.setAmtPerDrink(amtPerDrink);
        
        this.setDrinkCount(drinkCount);
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public final void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
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
    
    
    public final double getAmtPerDrink() {
        return amtPerDrink;
    }

    public final void setAmtPerDrink(double amtPerDrink) {
        this.amtPerDrink = amtPerDrink;
    }

    @Override
    public ServiceQuality getQ() {
        return servicequality;
    }

   
    
    @Override
    public final double getTip(){
       
        
       
        return amtPerDrink * drinkCount;
    }

    private void setServiceQuality(ServiceQuality serviceQuality) {
        this.servicequality = serviceQuality; 
    }
}
