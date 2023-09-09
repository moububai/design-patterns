package Golf;

/*
 * An observer that gets updated on the current strokes and par of a Subject
 * 
 * Current Subjects:
 *  Golfer
 * Current Observers:
 *  HoleScoreDisplay
 *  RoundScoreDisplay
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 9, 2023
 */

interface Observer{

    /*
     * The subject updates the observers on the changes of strokes a subject made and par of a current hole
     * 
     * @param strokes       The current strokes the Golfer made a hole
     * @param par           The current par the hole has
     */
    
    public void update(int strokes, int par);

    /*
     * Allows the user to see the contents of the last update given to the Observer.
     * 
     * @return toString     Returns the contents of the Observer to the user
     */
    public String toString();
}
