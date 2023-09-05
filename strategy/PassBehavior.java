package strategy;
/*
 * Pass behavior patterm for the player: Quaterback on offense
 */

public class PassBehavior implements OffenseBehavior 
{

    @Override
    public String play() {
        // TODO Auto-generated method stub
        String toReturn = "throws a ";
        String[] action = {"slant route", "out route", "seem route", "screen pass", "hail mary" };
        int rand = (int)(Math.random() * 4) + 1; // 1 to 4
        switch(rand)
        {
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
