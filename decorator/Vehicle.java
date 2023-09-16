package decorator;

import java.util.ArrayList;

/*
 * A new specific vehicle is created
 * 
 * Current Vehicles:
 *  Car
 * 
 * Vechile can be wrapped/decorated with the following:
 *  Paint
 *  Rims
 *  Smile
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public abstract class Vehicle{

    /*
     * The lines of the vehicles text files are recorded here
     * Each element of the Arraylist represents a line of the vehicle
     */

    protected ArrayList<String> lines;

    /*
     * Initializes a new Vehicle that can be stored
     * 
     * This vehicle can be decorated(see Header Comment)
     * 
     * @pram lines      The vehicle is stored in the arraylist
     */

    public Vehicle(ArrayList<String> lines){
        this.lines = lines;
    }

    /*
     * Allows user to see what the vehicle looks in text
     * 
     * Enables to print this class
     * 
     * @return toString()       returns the vehicle so it can be seen 
     */

    public String toString(){
        String complete = "";
        for (String line: lines)
            complete += line + "\n";
        return complete;
    }

    
}
