package longpipescw;
import java.text.DecimalFormat;
/**
 * Abstract Pipe Class. Inherited by Type1, Type 2 and Type 3. Holds all shared
 * methods.
 * @author GrD-10
 * @version 2.2
 */
abstract public class Pipe {
    private double lengthOfPipe;
    private double diameterOfPipe;
    private double baseCost;
    private double additionalCost;
    private double totalCost;
    private String pipeDetails = "";
    private int grade;
    private int quantity;
    private Boolean chemResist;
    private final double chemResistCost = 0.14;
    private final double[] gradeCost = {0.4, 0.6, 0.75, 0.8, 0.95};
    private DecimalFormat df = new DecimalFormat("###.##");
    
    /**
     * Base Pipe constructor used by every subclass.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param quantity How many similar Pipes are being ordered.
     */
    //super class with parameters that each sub class all have in common
    public Pipe(double diameterOfPipe, double lengthOfPipe, int grade, Boolean chemResist, int quantity){
        this.grade = grade;
        this.lengthOfPipe = lengthOfPipe;
        this.diameterOfPipe = diameterOfPipe;
        this.chemResist = chemResist;
        this.quantity = quantity;

        //call the base cost method so that additional cost can be calculated
        //then call total cost to retrieve the final total cost for that pipe
        baseCost();
        additionalCost();
        totalCost();
    }
    
    //get methods
    /**
     * Getter for the Pipes Length.
     * @return Length of the Pipes
     */
    public double getLengthOfPipe(){
        return lengthOfPipe;
    }
    
    /**
     * Getter for the Pipes Diameter.
     * @return Diameter of the Pipes
     */
    public double diameterOfPipe(){
        return diameterOfPipe;
    }
    
    /**
     * Getter for the Quantity of Pipes.
     * @return Quantity of Pipes.
     */
    public double getQuantity(){
        return quantity;
    }
    
    /**
     * Getter for the Grade of the Pipes.
     * @return Grade of Pipes.
     */
    public int getGrade()
    {
        return grade;
    }
    
    /**
     * Getter for the Base cost of a single Pipe. (Without Additional costs like 
     * Chemical Resistance)
     * @return Base Cost of Pipe.
     */
    public double getBaseCost()
    {
        return baseCost;
    }
    
    /**
     * Getter for Additional Cost of a single Pipe. (Without the Base cost)
     * @return Additional Cost of Pipe.
     */
    public double getAdditionalCost()
    {
        return additionalCost;
    }
    
    /**
     * Getter for whether or not the Pipes have Chemical Resistance.
     * @return Chemical Resistance.
     */
    public boolean getChemResist()
    {
        return chemResist;
    }
    
    /**
     * Calls the method to calculate extra Pipe details then returns the relevant
     * information to the user.
     * @return Details of Pipe.
     */
    public String getPipeDetails()
    {
        pipeDetails();
        return pipeDetails;
    }
    
    //setters
    /**
     * Sets the Chemical Resistance to a Value.
     * @param chemResist New Value for Chemical Resistance.
     */
    public void setChemResist(Boolean chemResist)
    {
        this.chemResist = chemResist;
    }
    
    /**
     * Sets Grade to a new Value.
     * @param grade New Value for Grade.
     */
    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    
    //adds Value to the additional pipe costs
    /**
     * Adds a cost to the Additional Cost.
     * @param percent Percentage of Base Cost that is being added on.
     */
    public void addAdditionalCost(double percent)
    {
        additionalCost += baseCost * percent;
    }
    
    /**
     * Adds Detail to Pipe Details.
     * @param detail New Detail in the format (Detail Name: Detail Value \n)
     */
    public void addPipeDetails(String detail)
    {
        pipeDetails += detail;
    }
    
    //calculate the volume of the Pipe
    /**
     * Calculates the Area of a Circle.
     * @param circleDiameter The Diameter of the circle. (In Inches)
     * @return The Area of the Circle.
     */
    public double circleArea(double circleDiameter)
    {
        return Math.PI * Math.pow(circleDiameter/2, 2);
    }
    
    /**
     * Calculates the Volume of the pipe from the Length, Diameter and Length.
     * @return Total Volume of Pipe.
     */
    public double calculateVolumeOfPipe(){
        //conversion of meters to inches
        double lengthPipeInches = lengthOfPipe / 0.0254;

        double totalVolume = circleArea(diameterOfPipe) - circleArea(diameterOfPipe*0.9);
        return totalVolume* lengthPipeInches;
        
    }
    
    /**
     * Checks the pipe has chemical Resistance then adds the value to the
     * additional Cost.
     */
    public void additionalCost(){
        //all pipes have chem resist in common so a first check will be required
        if(chemResist){
            additionalCost += baseCost * chemResistCost;
        }
    }
    
    /**
     * Calculates the base cost from the Volume and grade cost of the Pipe.
     */
    public void baseCost(){
        baseCost = calculateVolumeOfPipe() * gradeCost[grade - 1];
    }
    
    /**
     * Adds up the base and additional costs then calculates the new cost for
     * the number of pipes ordered.
     * @return Total Cost of all similar Pipes.
     */
    public double totalCost(){
        double calc = (baseCost + additionalCost) * quantity;
        //rounds to two decimal places
        totalCost = Double.parseDouble(df.format(calc));
        return totalCost;
    }
    
    //getting all the details of the pipe that each sub class have in common
    public void pipeDetails(){
        addPipeDetails("Diameter of pipe: " + Double.toString(diameterOfPipe) + " (Inches)\n"
                + "Length of pipe: " + Double.toString(lengthOfPipe) + " (Meters)\n"
                + "Grade: " + Integer.toString(grade) + "\n"
                + "Chemical Resistance: " + Boolean.toString(chemResist) + "\n");
        //return pipeDetails;
    }
        
   
}
