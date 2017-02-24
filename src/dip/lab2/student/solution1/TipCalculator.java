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
public interface TipCalculator {

    double getFairTip();

    double getGoodTip();

    double getPoorTip();
    
    double getTip();

    ServiceQuality getQ(); // make name more descriptive

    void setFairTip(double fairTip);

    void setGoodTip(double goodTip);

    void setPoorTip(double poorTip);
    
}
