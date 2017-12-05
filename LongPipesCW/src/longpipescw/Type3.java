/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

/**
 * Type 3 adds two colours to the Abstract colours
 * @author GrD-10
 * @version 1.1
 */
public class Type3 extends Pipe {
    private String colour1;
    private String colour2;
    private final double twoColourCost = 0.16;
    
    /**
     * Constructor for Type 3 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param colour2 The overlaid colour of the Pipe.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type3(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, int quantity){
        //Obtain super class' information if Type3 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, quantity);
        //super.pipeDetails();
        this.colour1 = colour1;
        this.colour2 = colour2;
        //add on another additional cost to the previously assigned additional cost
        addAdditionalCost(twoColourCost);
    }
    //setter and getter for colour1
    /**
     * Sets new value for Colour 1.
     * @param colour1  New value of colour1.
     */
    public void setColour1(String colour1){
        this.colour1 = colour1;
    }

    /**
     * Gets value from Colour 1.
     * @return colour1.
     */
    public String getColour1(){
        return colour1;
    }
    //setter and getter for colour2
    /**
     * Sets new value for Colour 2.
     * @param colour2  New value of colour2.
     */
    public void setColour2(String colour2){
        this.colour2 = colour2;
    }

    /**
     * Gets value from Colour 2.
     * @return colour2.
     */
    public String getColour2(){
        return colour2;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    /**
     * Adds Colour 1 and colour 2 to Pipe Details and Calls the Abstract Class
     * Details.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Colour 1: " + colour1 + "\nColour 2: "+ colour2 + "\n");
        //returns our new varibale content back to the super class
        //return super.pipeDetails;
    }
}
