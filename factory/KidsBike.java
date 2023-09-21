package factory;

/*
 * Creates a new Kids Bike
 * 
 * Bike can be assembled through the method assembleBike. No Price is currently set
 * 
 * @author Cameron Reyes
 * @version 1.0
 */

public class KidsBike extends Bike {
    
    /*
     * Create's a new Kids Bike
     * 
     * Get's called when createBike calls "kids bike"
     * 
     */

    public KidsBike(){
        name = "Kids Bike";
        hasTrainingWheels = true;
        hasPeddals = true;
        numWheels = 2;
    }
}
