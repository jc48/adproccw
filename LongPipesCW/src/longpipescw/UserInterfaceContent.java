/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

import java.util.*;
/**
 *
 * @author conorfarrell
 */
public class UserInterfaceContent extends UserInterface {
    //setter and getter for costPerQubicInch
   
    public ArrayList getOrderDetails(){
        return order;
    }
    public double getDiameterContent()
    {
        return diameterContent;
    }
   
    public double getLengthContent()
    {
        return lengthContent;
    }
    
    public int getGradeContent()
    {
        return gradeContent;
    }
    
    public double getQuantityContent()
    {
        return quantityContent;
    }
    
    public Boolean getChemResistContent()
    {
        return chemResistContent;
    }
    
    public String getColour1Content()
    {
        return colour1Content;
    }
    
    public String getColour2Content()
    {
        return colour2Content;
    }
    
    public String getNumOfColours()
    {
        return numOfColours;
    }
    
    public Boolean getInnerInsulationContent()
    {
        return innerInsulationContent;
    }
    
    public Boolean getOutterReinforcement()
    {
        return outterReinforcementContent;
    }
    
    public void typeSelector(){
        
    }
}
