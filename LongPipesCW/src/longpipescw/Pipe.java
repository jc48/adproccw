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
public class Pipe {
    protected double lengthOfPipe;
    protected double diameterOfPipe;
    protected int pipeType;
    protected int grade;
    protected double costPerQubicInch;
    protected Boolean chemResist;
    private String colour1;
    private String colour2;
    private Boolean innerInsulation;
    private Boolean outterReinforcement;
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist){
        pipeType = 1;
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
            default :
               System.out.println("USE FOR VALIDATION");
        }
    }
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1){
        pipeType = 2;
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.colour1 = colour1;
        switch(this.grade) {
            case 2 :
               costPerQubicInch = 0.6;
               break;
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.8;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
    }
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String Colour2){
        pipeType = 3;
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.colour1 = colour1;
        this.colour2 = colour2;
        switch(this.grade) {
            case 2 :
               costPerQubicInch = 0.6;
               break;
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.8;
                break;
            case 5 :
                costPerQubicInch = 0.95;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
    }
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String Colour2, Boolean
                innerInsulation){
        pipeType = 4;
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.colour1 = colour1;
        this.colour2 = colour2;
        this.innerInsulation = innerInsulation;
        switch(this.grade) {
            case 2 :
               costPerQubicInch = 0.6;
               break;
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.8;
                break;
            case 5 :
                costPerQubicInch = 0.95;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
    }
    
    public Pipe(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String Colour2, Boolean
                innerInsulation, Boolean outterReinforcement){
        pipeType = 5;
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.colour1 = colour1;
        this.colour2 = colour2;
        this.innerInsulation = innerInsulation;
        this.outterReinforcement = outterReinforcement;
        switch(this.grade) {
            case 3 :
                costPerQubicInch = 0.75;
                break;
            case 4 :
                costPerQubicInch = 0.8;
                break;
            case 5 :
                costPerQubicInch = 0.95;
                break;
            default :
               System.out.println("USE FOR VALIDATION");
        }
    }
    
    
    //setter and getter for colour1
    public void setColour2(String colour2)
    {
        this.colour1 = colour2;
    }
   
    public String getColour2()
    {
        return colour1;
    }
    
    //setter and getter for innerInsulation
    public void setInnerInsulation(Boolean innerInsulation)
    {
        this.innerInsulation = innerInsulation;
    }
   
    public Boolean getInnerInsulation()
    {
        return innerInsulation;
    }
    
    //setter and getter for innerInsulation
    public void setOutterReinforcement(Boolean outterReinforcement)
    {
        this.outterReinforcement = outterReinforcement;
    }
   
    public Boolean getOutterReinforcement()
    {
        return outterReinforcement;
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
        
   
}
