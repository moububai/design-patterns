package strategy;

/*
 * OBlockBeavhior when a enumeration of the player class LineMan for an offense behavior
 */

public class OBlockBehavior implements OffenseBehavior
{

    @Override
    public String play()
    {
        return "Block Defenders";
    }
    
}
