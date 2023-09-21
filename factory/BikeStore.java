package factory;

public class BikeStore {

    public Bike createBike(String type){
        if (type.equals("tricycle")){
            return new Tricycle();
        }
        else if (type.equals( "strider")){
            return new Strider();
        }
        else{
            return new KidsBike();
        }
        
    }
    
}
