package Golf;

/*
 * A RoundScoreDisplay is craeted that allows the user to get notified of changes given by the Golfer
 * 
 * This allows the overall hole stats to be seen by the user. 
 * Stats seen:
 *  int strokesTotal     The total stroke added through each recent updated
 *  int par         The total par added through each recent updated
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 9, 2023
 */

public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal = 0;
    private int parTotal = 0;

    /*
     * A new RoundScoreDisplay observer is created, that gives updates on the current total stokes and pars
     * 
     * The RoundScoreDisplay registers to be able to see the current golfers stats. The ammount of 
     * golfers is limited to one throughout this RoundScoreDisplay.
     * 
     * @param golfer        The Golfer that the current RoundScoreDisplay is watching.
     */

    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /*
     * Update allows the Golfer's current strokes and pars to be accessed throughout the RoundScoreDisplay
     * 
     * The strokesTotal adds the current strokes param called in, the parTotal adds the current par param called in
     * 
     * @param strokes       The number of strokes the Golfer has the current hole; given by golfer
     * @param par           The par the current Golfer's hole has; given by golfer
     */

    public void update(int strokes, int par){
        this.strokesTotal += strokes;
        this.parTotal += par;

    }

    /*
     * Enables to print this class, and gives the user the total pars, strokes, and how much over par from last update
     * 
     * The total how much over par is given through subtracting the parTotal and strokeTotal through the last given update
     * 
     * @return toString     returns the total pars, strokes, and how much over par
     */

    public String toString(){
        if (this.strokesTotal > this.parTotal){
            return "Overall stats: Par (" + Integer.toString(this.parTotal) + ") Strokes (" + Integer.toString(this.strokesTotal) + "), " + (this.strokesTotal - this.parTotal) + " over par";
        }
        return "Overall stats: Par (" + Integer.toString(this.parTotal) + ") Strokes (" + Integer.toString(this.strokesTotal) + "), Making par";
    }
    
}
