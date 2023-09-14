package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle{
    
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor){

    }
}
