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
public class Type3 extends Pipe {
    private String colour1;
    private String colour2;
    public Type3(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2){
        super(lengthOfPipe, diameterOfPipe, grade, chemResist);
        super.pipeType = 3;
        this.colour1 = colour1;
        this.colour2 = colour2;
        super.additionalCost += baseCost * 0.12;
        super.additionalCost += baseCost * 0.16;
    }
    public void setColour1(String colour1)
    {
        this.colour1 = colour1;
    }

    public String getColour1()
    {
        return colour1;
    }
    
    public void setColour2(String colour2)
    {
        this.colour2 = colour2;
    }

    public String getColour2()
    {
        return colour2;
    }
}
