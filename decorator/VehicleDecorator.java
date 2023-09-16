package decorator;

import java.util.ArrayList;

/*
 * Wraps the Vehicle so it can be decorated
 * 
 * Current Decorations:
 *  Smile
 *  Rims
 *  Paint
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public abstract class VehicleDecorator extends Vehicle{
    
    /*
     * The vehicle to be decorated is stored here
     * 
     * @param lines     The current vehicle to be decorated
     */

    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    /*
     * Decorates a car through the Arraylist passed through
     * 
     * The ascii of the Decoration that is not blank(= ' ') overrides the text location of the lines arraylist
     * 
     * Decoration:
     *  Rims
     *  Smile
     * 
     * @param decor     The decoration to be applied to the car
     */

    protected void integrateDecor(ArrayList<String> decor){
        for (int i = 0; i < decor.size(); i++){
            
            if(!(decor.get(i).isBlank())){
                char[] toChange = lines.get(i).toCharArray();
                for (int j = 0; j < decor.get(i).length(); j++){
                    if(!(decor.get(i).charAt(j) == ' ')){
                        toChange[j] = decor.get(i).charAt(j);
                    }
                }
                lines.set(i, String.valueOf(toChange));
            }

        }
    }
}
