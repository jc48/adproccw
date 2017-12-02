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
public class Type1 extends Pipe {
    public Type1(double diameterOfPipe, double lengthOfPipe,int grade, Boolean chemResist, int quantity){
        //Obtain super class' information if Type1 is chosen
        super(diameterOfPipe, lengthOfPipe, grade, chemResist, quantity);
    }
}
