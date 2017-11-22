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
public class Type4 extends Type3 {
    protected Boolean innerInsulation;
    public Type4(double lengthOfPipe, double diameterOfPipe, int grade, Boolean chemResist, String colour1, String colour2, Boolean innerInsulation){
        super(lengthOfPipe, diameterOfPipe, grade, chemResist, colour1, colour2);
        super.pipeType = 4;
        super.additionalCost += baseCost * 0.13;
    }
    public void setInnerInsulation(Boolean innerInsulation)
    {
        this.innerInsulation = innerInsulation;
    }
   
    public Boolean getInnerInsulation()
    {
        return innerInsulation;
    }
}
