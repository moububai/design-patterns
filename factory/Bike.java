package factory;

/*
 * A new Bike is created and ready for assembly
 * Current Bike Types:
 *  KidsBike
 *  Tricycle
 *  Strider
 * 
 * @author Cameron Reyes
 * @version 1.0
 */

public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;


    /*
     * Tells user the assembly for the Bike Type
     * 
     * @return BikeCreation     Returns the parts constructed in bike type
     */
    public String assembleBike(){
        String BikeCreation = "Creating a " + name + "\n" +
        createFrame() + addWheels() + addPedals();

        return BikeCreation;
    }

    /*
     * Helper method to tell user the Bike's frame
     * 
     * @return createFrame      Tells the user the fram is being assembled
     */

    private String createFrame(){
        return "- Assembling " + name + " frame\n";
    }

    /*
     * Helper method to tell user the wheels of the Bike
     * 
     * Bike will add Training Wheels, for the following bikes:
     *  Tricycle
     *  Kids Bike 
     * 
     * @return addWheels        Tells the user the wheels in the bike being assembled
     */

    private String addWheels(){
        String wheelString = "- Adding " + numWheels + " wheel(s)\n";
        
        if(hasTrainingWheels){
            return wheelString + "- Adding training wheels\n";
        }
        return wheelString;
    }

    /*
     * Helper method to add Pedals to the Bike
     * 
     * Bike will add Pedals for the following bikes:
     *  Kids Bike
     *  Tricycle
     * 
     * @return                Tells the user if the bike has pedals
     */

    private String addPedals(){
        if(hasPeddals){
            return "- Adding pedals\n";
        }
        return "";
    }

    /*
     * Tell's the user how much the Bike cost
     * 
     * This has not been set for any bike currently
     * 
     * @return price        The price of the current Bike 
     */

    public double getPrice(){
        return price;
    }
    
}
