package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle{
    
    public VehicleDecorator(ArrayList<String> lines) {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor){
        for (int i = 0; i < decor.size(); i++){
            
            if(!(decor.get(i).isBlank())){
                char[] toChange = lines.get(i).toCharArray();
                for (int j = 0; j < decor.get(i).length(); j++){
                    if(!(decor.get(i).charAt(j) == ' ')){
                        toChange[j] = decor.get(i).charAt(j);
                    }
                }
                lines.set(i, String.valueOf(toChange));
            }

        }
    }
}
