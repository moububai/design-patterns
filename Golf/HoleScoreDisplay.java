package Golf;

/*
 * A HoleScoreDisplay is craeted that allows the user to get notified of changes given by the Golfer
 * 
 * This allows the current hole stats to be seen by the user. 
 * Stats seen:
 *  int strokes     The current stroke recently updated
 *  int par         The current par recently updated
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 9, 2023
 */

public class HoleScoreDisplay implements Observer {
    
    private Subject golfer;
    private int strokes;
    private int par;

    /*
     * A new HoleScoreDisplay observer is created, that gives updates on the current stokes and pars
     * 
     * The HoleScoreDisplay registers to be able to see the current golfers stats. The ammount of 
     * golfers is limited to one throughout this HoleScoreDisplay.
     * 
     * @param golfer        The Golfer that the current HoleScoreDisplay is watching.
     */

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /*
     * Update allows the Golfer's current strokes and pars to be accessed throughout the HoleScoreDisplay
     * 
     * @param strokes       The number of strokes the Golfer has the current hole; given by golfer
     * @param par           The par the current Golfer's hole has; given by golfer
     */

    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
    }

    /*
     * Enables to print this class, and gives the user the current pars, strokes, and how much over par last updated
     * 
     * The current how much over par is given through subtracting the pars and strokes through the last given update
     * 
     * @return toString     returns the current pars, strokes, and how much over par
     */
    
    public String toString(){
        if (this.strokes > this.par){
            return "Current Hole stats: Par (" + Integer.toString(this.par) + ") Strokes (" + Integer.toString(this.strokes) + "), " + (this.strokes - this.par) + " over par";
        }
        if (this.par > this.strokes){
            return "Current Hole stats: Par (" + Integer.toString(this.par) + ") Strokes (" + Integer.toString(this.strokes) + "), " + (this.par - this.strokes) + " under par";
        }
        return "Current Hole stats: Par (" + Integer.toString(this.par) + ") Strokes (" + Integer.toString(this.strokes) + "), Making par";
        
    }
    
}
