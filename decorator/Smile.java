package decorator;

public class Smile extends VehicleDecorator{
    
    public Smile(Vehicle vehicle){
        super(FileReader.getLines("smile.txt"));
    }
}
