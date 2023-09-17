package decorator;

/*
 * Wraps the Vehicle with a paint of a desired color of:
 * red
 * green
 * yellow
 * blue
 * cyan 
 * black(none)
 * 
 * The colors are used through ANSI escape code for the terminal
 * 
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 15, 2023
 */

public class Paint extends VehicleDecorator{
    
    /*
     * Paints only the vehicle a valid(see Header Comment) color
     * 
     * @param vehicle       The vehicle that is being painted
     * @param color         The color if valid(see Header Comment) is used to change vehicle color
     */
    
    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
        int lastLine = vehicle.lines.size() - 1;
        
        vehicle.lines.set(0, findColor(color) + vehicle.lines.get(0));
        vehicle.lines.set(lastLine, vehicle.lines.get(lastLine) + findColor("black"));
    }

    /*
     * Determines if the color passed is valid(see Header Comment)
     * 
     * If the color passed through is not valid, the color determined is black
     * The color returns a ansi color code to change the terminal
     * This is added to the start of the first line of the vehicle
     * 
     * @param color         The color if valid(see Header Comment) is used to change vehicle color
     */

    private String findColor(String color){
        String[][] colors = {{"black", "\u001B[0m"}, {"red", "\u001B[31m"},
        { "green","\u001B[32m" }, { "yellow", " \"\\u001B[33m\""}, { "blue", "\u001B[34m" },
        { "purple", "\u001B[35m"}, { "cyan", "\u001B[36m"},} ;

        for (int i = 0; i < color.length(); i++){
            if (colors[i][0].equals(color.toLowerCase())){
                return colors[i][1];
            }
        }
        return "";
    }
}
