package decorator;

public class Rims extends VehicleDecorator{
    
    public Rims(Vehicle vehicle){
        super(FileReader.getLines("rims.txt"));
    }
}
