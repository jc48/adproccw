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
public class Type5 extends Type4 {
    private Boolean outerReinforcement;
    private final double outerReinforcementCost = 0.17;
    public Type5(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, int quantity){
        //Obtain super class' information if Type5 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, quantity);
        //super.pipeDetails();
        this.outerReinforcement = true;
        //add on another additional cost to the previously assigned additional cost
        addAdditionalCost(outerReinforcementCost);
    }
    
    //setter and getter for InnerInsulation
    public void setOuterReinforcement(Boolean outterReinforcement){
        this.outerReinforcement = outterReinforcement;
    }
   
    public Boolean getOuterReinforcement(){
        return outerReinforcement;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Outer Reinforcement: " + outerReinforcement + "\n");
        //returns our new varibale content back to the super class
        //return super.pipeDetails;
    }
}
