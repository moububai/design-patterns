package strategy;

public class BlockBehavior implements DefenseBehavior
{

    @Override
    public String play()
    {
        String toReturn = "block a ";
        String[] action = {"kick", "punt", "pass", "catch"};
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
