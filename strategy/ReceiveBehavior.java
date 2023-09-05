package strategy;

/*
 * Recieve behavior patterm for the player: Reciever on offense
 */

public class ReceiveBehavior implements OffenseBehavior{

    @Override
    public String play() {
        // TODO Auto-generated method stub
        String toReturn = "runs a ";
        String[] action = { "slant route", "out route", "seem route", "screen pass", "hail mary" };
        int rand = (int)(Math.random() * 4) + 1; // 1 to 4
        switch(rand){
            case 1:
                return toReturn + action[0];
            case 2:
                return toReturn + action[1];
            case 3:
                return toReturn + action[2]; 
            case 4:
                return toReturn + action[3];

        }
        return "Error";
    }
    
    
}
