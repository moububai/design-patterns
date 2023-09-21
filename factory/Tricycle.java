package factory;

/*
 * Creates a new Tricycle
 * 
 * Bike can be assembled through the method assembleBike. No Price is currently set
 * 
 * @author Cameron Reyes
 * @version 1.0
 */

public class Tricycle extends Bike {
    
    /*
     * Create's a new Tricycle
     * 
     * Get's called when createBike calls "tricycle"
     * 
     */

    public Tricycle(){
        name = "Tricycle";
        hasPeddals = true;
        numWheels = 3;
    }
}
