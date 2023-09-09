package Golf;

import java.util.ArrayList;

/*
 * A new Golfer subject is created, that updates and registers observers.
 * Observers:
 *  HoleScoreDisplay: Displays the current par and strokes for one hole
 *  RoundScoreDisplay: Displays the total par  and strokes for all current holes
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 9, 2023
 */

public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /*
     * Constructer that initizliazes the arraylist of Observers and gives the Golfer a name.
     * 
     * @param name      The name of the Golfer is connnected to the class 
     */
    public Golfer(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();
    }

    /*
     * Registers an Observer to get updated of strokes and pars made by the Golfer. 
     * 
     * @param observer      the observer is added to the arraylist to recieve updates from the Golfer
     */

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /*
     * Removes an Observer to get updates of strokes and pars made by the Golfer.
     * 
     * @param observer      the observer is removed from the arraylist and can no longer recieve updates from the Golfer
     */

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /*
     * For each observer currently added in the arraylist, each observer get's an updated stroke and par for the current hole.
     * 
     * The method requires the observer use of the update method.
     * 
     * @param strokes       The number of strokes the Golfer has the current hole
     * @param par           The par the current Golfer's hole has
     */

    public void notifyObserver(int strokes, int par){
        for (Observer observer: observers){
            observer.update(strokes, par);
        }
    }

    /*
     * An inputted number of strokes and par the Golfer has for a current hole.
     * 
     * The number of strokes and par the Golfer has for the current hole then updates the current Observers registered
     * in the arraylist; through using the notifyObserver method.
     * 
     * @param strokes       The number of strokes the Golfer has the current hole
     * @param par           The par the current Golfer's hole has
     */

    public void enterScore(int strokes, int par){
        notifyObserver(strokes, par);
    }

    /*
     * Give's the user the Golfer's name created with the Golfer was constructed
     * 
     * @return name     The name of the golfer
     */

    public String getName(){
        return this.name;
    }
    
}
