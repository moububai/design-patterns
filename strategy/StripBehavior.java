package strategy;

/*
 * Strip behavior patterm for the player: Lineman on defense
 */

public class StripBehavior implements DefenseBehavior{

    @Override
    public String play() {
        return "Strip a ball from runners hands";
    }
    
}
