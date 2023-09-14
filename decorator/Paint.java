package decorator;

public class Paint extends VehicleDecorator{
    
    /*
     * Need to look over this
     */
    
    public Paint(Vehicle vehicle, String color){
        super(FileReader.getLines(color));
    }
}
