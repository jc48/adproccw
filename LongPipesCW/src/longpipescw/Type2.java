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
public class Type2 extends Pipe {
    private String colour1;
    public Type2(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1){
        super(lengthOfPipe, diameterOfPipe, grade, chemResist);
        super.pipeType = 2;
        this.colour1 = colour1;
        super.additionalCost += baseCost * 0.12;
    }
    public void setColour1(String colour1)
    {
        this.colour1 = colour1;
    }

    public String getColour1()
    {
        return colour1;
    }
}
