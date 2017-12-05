/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

/**
 * Type 2 adds one Colour to the abstract class.
 * @author Grd-10
 * @version 1.1
 */
public class Type2 extends Pipe {
    private String colour1;
    private final double oneColourCost = 0.12;
    
    /**
     * Constructor for Type 2 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type2(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, int quantity){
        //Obtain super class' information if Type2 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, quantity);
        //super.pipeDetails();
        this.colour1 = colour1;
        //add on another additional cost to the previously assigned additional cost
        addAdditionalCost(oneColourCost);
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
    
    /**
     * Calls pipe details from Abstract class then adds colour1 to Pipe Details.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Colour 1: " + colour1 + "\n");
        //returns our new varibale content back to the super class
        //return super.pipeDetails;
    }
    
}
