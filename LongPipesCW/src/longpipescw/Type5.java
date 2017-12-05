/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

/**
 * Type 5 adds outer Reinforcement to Type 4.
 * @author GrD-10
 * @version 1.1
 */
public class Type5 extends Type4 {
    private Boolean outerReinforcement;
    private final double outerReinforcementCost = 0.17;
    
    /**
     * Constructor for Type 5 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param colour2 The overlaid colour of the Pipe.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type5(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, int quantity){
        //Obtain super class' information if Type5 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, quantity);
        //super.pipeDetails();
        this.outerReinforcement = true;
        //add on another additional cost to the previously assigned additional cost
        addAdditionalCost(outerReinforcementCost);
    }
    
    //setter and getter for InnerInsulation
    /**
     * Sets Outer Reinforcement to a new Value.
     * @param outerReinforcement New Value for outer Reinforcement.
     */
    public void setOuterReinforcement(Boolean outerReinforcement){
        this.outerReinforcement = outerReinforcement;
    }
   
    /**
     * Gets Value of Outer Reinforcement.
     * @return Outer Reinforcement.
     */
    public Boolean getOuterReinforcement(){
        return outerReinforcement;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    /**
     * Adds Outer Reinforcement to Pipe Details and Calls the Type 4 Details.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Outer Reinforcement: " + outerReinforcement + "\n");
        //returns our new varibale content back to the super class
        //return super.pipeDetails;
    }
}
