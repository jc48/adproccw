package longpipescw;

/**
 * Basic Type1 Class with no additions from the abstract class.
 * @author GrD-10
 * @version 1.0
 */
public class Type1 extends Pipe {
    /**
     * Constructor for Type 1 Pipe.
     * @param diameterOfPipe The diameter of the Pipe in Inches.
     * @param lengthOfPipe The length of the Pipe in Meters.
     * @param grade The Grade of the Pipe.
     * @param chemResist Whether or not the Pipe has Chemical Resistance.
     * @param quantity How many similar Pipes are being ordered.
     */
    public Type1(double diameterOfPipe, double lengthOfPipe, int grade, Boolean chemResist, int quantity){
        //Obtain super class' information if Type1 is chosen
        super(diameterOfPipe, lengthOfPipe, grade, chemResist, quantity);
    }
}
