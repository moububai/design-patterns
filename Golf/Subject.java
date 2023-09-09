package Golf;

/*
 * A subject allows the observers to get updates on the subject's strokes and par
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

interface Subject{

    /*
     * Allows the observer to get added to an arraylist of observers updated when notifyObserver is called
     * 
     * @param observer      The observer to get added to the arraylist
     */

    public void registerObserver(Observer observer);

    /*
     * Removes an observer from the arraylist, stopping the observer from getting any updates
     * 
     * @param observer      The observer to get removed from the arraylist
     */
    public void removeObserver(Observer observer);

    /*
     * Updates the observers on the changes of strokes a golfer made and par of a current hole
     * 
     * @param strokes       The current strokes the Golfer made a hole
     * @param par           The current par the hole has
     */
    public void notifyObserver(int strokes, int par);
}
