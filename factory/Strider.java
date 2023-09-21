package factory;

/*
 * Creates a new Strider
 * 
 * Bike can be assembled through the method assembleBike. No Price is currently set
 * 
 * @author Cameron Reyes
 * @version 1.0
 */

public class Strider extends Bike {
    
    /*
     * Create's a new Strider
     * 
     * Get's called when createBike calls "strider"
     * 
     */

    public Strider(){
        name = "Strider";
        numWheels = 2;
    }
}
