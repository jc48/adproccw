package longpipescw;

/**
 * Extends Type 3 due to having Two Colours and Adds Inner Insulation to Pipes.
 * @author GrD-10
 * @version 1.1
 */
public class Type4 extends Type3 {
    private Boolean innerInsulation;
    private final double innerInsulationCost = 0.13;
    
    /**
     * Constructor for Type 4 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param colour1 The Base colour of the Pipe.
     * @param colour2 The overlaid colour of the Pipe.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type4(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, int quantity){
        //Obtain super class' information if Type4 is chosen
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2, quantity);
        this.innerInsulation = true;
        //add on another additional cost to the previously assigned additional cost
        addAdditionalCost(innerInsulationCost);
    }
    
    //setter and getter for InnerInsulation
    /**
     * Sets Inner Insulation to a new Value.
     * @param innerInsulation New Value for Inner Insulation.
     */
    public void setInnerInsulation(Boolean innerInsulation){
        this.innerInsulation = innerInsulation;
    }
   
    /**
     * Gets Value of Inner Insulation.
     * @return Inner Insulation.
     */
    public Boolean getInnerInsulation(){
        return innerInsulation;
    }
    
    //pipe details gets all the details from the super class and then adds our 
    //additional parameter of colour1
    /**
     * Adds Inner Insulation to Pipe Details and Calls the Type 3 Details.
     */
    public void pipeDetails(){
        super.pipeDetails();
        addPipeDetails("Inner Insulation: " + innerInsulation + "\n");
        //returns our new varibale content back to the super class
        //return super.pipeDetails;
    }
}
