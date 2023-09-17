package decorator;


/*
 * Wraps the vehicle with a rim for the vehicle's tires
 * 
 * This reads a  file containing an ascii art for rims.
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public class Rims extends VehicleDecorator{
    
    /*
     * Adds Rims to a given vehicle file
     * 
     * The ascii of the rims that is not blank(= ' ') overrides the text location of the vehicle,
     * 
     * @param vehicle       The vehicle that the rims are being applied to
     */
    
    public Rims(Vehicle vehicle){
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator\\text\\rims.txt"));
    }
}
