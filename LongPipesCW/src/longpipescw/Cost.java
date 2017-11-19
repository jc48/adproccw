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
public class Cost {
    //fix this hack
    private Pipe pipe;
    
    private double baseCost = 0;
    private double additionalCost = 0;
    private double totalCost = 0;
    private double colour1 = 0.12;
    private double colour2 = 0.16;
    private double innerInsulation = 0.13;
    private double outerReinforcement = 0.17;
    private double chemResistance = 0.14;
    
    public Cost(){
    }
    public double calculateCost(Pipe pipe){
            baseCost = pipe.getVolumeOfPipe() * pipe.getCostPerQubicInch();
            //Base Cost per qubic inch
            switch(pipe.getPipeType()) {
                case 1 :
                   baseCost = baseCost;
                   if(pipe.getChemResist()){
                       additionalCost = baseCost * chemResistance;
                   }
                   totalCost = baseCost + additionalCost;
                   break;
                case 2 :
                    baseCost = baseCost;
                    additionalCost += baseCost * colour1;
                    if(pipe.getChemResist()){
                        additionalCost += baseCost * chemResistance;
                    }
                    totalCost = baseCost + additionalCost;
                    break;
                case 3 :
                    baseCost = baseCost;
                    additionalCost += baseCost * colour1;
                    additionalCost += baseCost * colour2;
                    if(pipe.getChemResist()){
                        additionalCost += baseCost * chemResistance;
                    }
                    totalCost = baseCost + additionalCost;
                    break;
                case 4 :
                    baseCost = baseCost;
                    additionalCost += baseCost * colour1;
                    additionalCost += baseCost * colour2;
                    additionalCost += baseCost * innerInsulation;
                    if(pipe.getChemResist()){
                        additionalCost += baseCost * chemResistance;
                    }
                    totalCost = baseCost + additionalCost;
                    break;
                case 5 :
                    baseCost = baseCost;
                    additionalCost += baseCost * colour1;
                    additionalCost += baseCost * colour2;
                    additionalCost += baseCost * innerInsulation;
                    additionalCost += baseCost * outerReinforcement;
                    if(pipe.getChemResist()){
                        additionalCost += baseCost * chemResistance;
                    }
                    totalCost = baseCost + additionalCost;
                    break;
                default :
                   System.out.println("THIS MEANS THE TYPE DOESNT MATCH THE RULES");
            }
            return totalCost;
        }
   
}
