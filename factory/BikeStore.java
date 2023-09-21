package factory;

/*
 * If a new Bike is correctly inputted, then it is created
 * 
 * Current Bike Types:
 *  KidsBike
 *  Tricycle
 *  Strider
 * 
 * @author Cameron Reyes
 * @version 1.0
 */

public class BikeStore {

    /*
     * Creates a Bike of Matching Type
     * 
     * A null variable is created if there is no match to the Bike's name. The
     * current parameters take in a lowercase of the bike needed. Requires space 
     * if Bike type has a capital. ex. KidsBike -> "kids bike"
     *
     * @return      The new Bike is created for the user
     */
    public Bike createBike(String type){
        if (type.equals("tricycle")){
            return new Tricycle();
        }
        else if (type.equals( "strider")){
            return new Strider();
        }
        else if (type.equals( "kids bike")){
            return new KidsBike();
        }
        return null;
    }
    
}
