package strategy;

public class QuarterBack extends Player
{
    public QuarterBack(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    public void setDefenseBehavior()
    {
        defenseBehavior = null;
    }
    public void setOffenseBehavior()
    {
        int rand = (int)(Math.random() * 2) + 1; // 1 or 2
            if (rand == 1)
                offenseBehavior = new RunBehavior();
            else
                offenseBehavior = new PassBehavior();
    }
    
}
