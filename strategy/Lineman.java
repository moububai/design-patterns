package strategy;

public class Lineman extends Player
{
    public Lineman(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    public void setDefenseBehavior()
    {
        int rand = (int)(Math.random() * 3) + 1; // 1, 2 or 3
        switch(rand)
        {
            case 1:
                defenseBehavior = new BlockBehavior();
                break;
            case 2:
                defenseBehavior = new StripBehavior();
                break;
            case 3:
                defenseBehavior = new SackBehavior();
                
        }
            
    }
    public void setOffenseBehavior()
    {
        offenseBehavior = new OBlockBehavior();
    }
    
}
