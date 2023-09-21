package factory;

public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    public String assembleBike(){
        String BikeCreation = "Creating a " + name + "\n" +
        createFrame() + addWheels() + addPedals();

        return BikeCreation;
    }

    private String createFrame(){
        return "- Assembling " + name + " frame\n";
    }

    private String addWheels(){
        String wheelString = "- Adding " + numWheels + " wheel(s)\n";
        
        if(hasTrainingWheels){
            return wheelString + "- Adding training wheels\n";
        }
        return wheelString;
    }

    private String addPedals(){
        if(hasPeddals){
            return "- Adding pedals\n";
        }
        return "";
    }

    public double getPrice(){
        return price;
    }
    
}
