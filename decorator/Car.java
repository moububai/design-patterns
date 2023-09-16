package decorator;

/*
 * A new car is created through ascii art of a car
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public class Car extends Vehicle{
    
    /*
     * Reads an ascii file of a car
     * 
     * Initializes the String arraylist in vehicles through reading the text file that contains a ascii art of a car
     */
    public Car(){
        super(FileReader.getLines("decorator\\car.txt"));
    }
}
