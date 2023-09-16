package decorator;

/*
 * Wraps the vehicle with a Smile for the vehicle's front
 * 
 * This reads a  file containing an ascii art for a car's Smile.
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public class Smile extends VehicleDecorator{
    
    /*
     * Adds a Smile to a given vehicle file
     * 
     * The ascii of the Smile that is not blank(= ' ') overrides the text location of the vehicle,
     * 
     * @param vehicle       The vehicle that the Smile is being applied to
     */

    public Smile(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator\\\\smile.txt"));
    }
}
