package decorator;

public class Paint extends VehicleDecorator{
    
    /*
     * Need to look over this
     */
    
    public Paint(Vehicle vehicle, String color){
        super(vehicle.lines);
        vehicle.lines.set(0, findColor(color) + vehicle.lines.get(0));
        int lastLine = vehicle.lines.size() - 1;
        vehicle.lines.set(lastLine, vehicle.lines.get(lastLine) + findColor("black"));
    }

    private String findColor(String color){
        String[][] colors = {{"black", "\u001B[0m"}, {"red", "\u001B[31m"},
        { "green","\u001B[32m" }, { "yellow", " \"\\u001B[33m\""}, { "blue", "\u001B[34m" },
        { "purple", "\u001B[35m"}, { "cyan", "\u001B[36m"},} ;
        for (int i = 0; i < color.length(); i++){
            if (colors[i][0].equals(color.toLowerCase())){
                return colors[i][1];
            }
        }
        return "Color not found";
    }
}
