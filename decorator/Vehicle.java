package decorator;

import java.util.ArrayList;

public abstract class Vehicle{

    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines){
        this.lines = lines;
    }

    public String toString(){
        String complete = "";
        for (String line: lines)
            complete += line + "\n";
        return complete;
    }

    
}
