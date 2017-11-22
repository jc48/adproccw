/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

/**
 *
 * @author conorfarrell
 */
//PUT BACK IN ABSTRACT
abstract public class Pipe {
    protected double lengthOfPipe;
    protected double diameterOfPipe;
    protected double baseCost;
    protected double additionalCost;
    protected double totalCost;
    protected int pipeType;
    protected int grade;
    protected double quantity;
    protected double costPerQubicInch;
    protected Boolean chemResist;
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist){
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        switch(this.grade) {
            case 1 :
               costPerQubicInch = 0.4;
               break;
            case 2 :
                costPerQubicInch = 0.6;
                break;
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.80;
                break;
            case 5 :
                costPerQubicInch = 0.95;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
        baseCost();
        additionalCost();
        totalCost();
    }
    
    public double getLengthOfPipe(){
        return lengthOfPipe;
    }
    
    public double diameterOfPipe(){
        return diameterOfPipe;
    }
    
    //getter for pipeType
   
    public int getPipeType()
    {
        return pipeType;
    }
    
    //setter and getter for grade
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
   
    public int getGrade()
    {
        return grade;
    }
    
    //setter and getter for costPerQubicInch
    public void setCostPerQubicInch(double costPerQubicInch)
    {
        this.costPerQubicInch = costPerQubicInch;
    }
   
    public double getCostPerQubicInch()
    {
        return costPerQubicInch;
    }
    
    //setter and getter for costPerQubicInch
    public void setChemResist(Boolean chemResist)
    {
        this.chemResist = chemResist;
    }
   
    public boolean getChemResist()
    {
        return chemResist;
    }
    
    public double getVolumeOfPipe(){
        //conversion of meters to inches
        double lengthPipeInches = lengthOfPipe / 0.0254;
        
        double outerRadius = diameterOfPipe / 2;
        outerRadius = Math.pow(outerRadius,2);
        double outervolumeOfPipe = (Math.PI * outerRadius) * lengthPipeInches;
    
        //get the inner volume pi * r^2 * height
        double innerRadius = (diameterOfPipe / 2) * 0.9;
        innerRadius = Math.pow(innerRadius,2);
        double innervolumeOfPipe = (Math.PI * innerRadius) * lengthPipeInches; 
    
        //get the total volume of raw materials
        double totalVolume = outervolumeOfPipe - innervolumeOfPipe;
        
        return totalVolume;
    }
    
    public double additionalCost(){
        if(chemResist == true){
            additionalCost += baseCost * 0.14;
        }
        return additionalCost;
    }
    
    public double baseCost(){
        baseCost = getVolumeOfPipe() * getCostPerQubicInch();
        return baseCost;
    }
    
    public double totalCost(){
        totalCost = (baseCost + additionalCost) * quantity;
        return totalCost;
    }
    
        
   
}
