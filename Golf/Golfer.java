package Golf;

import java.util.ArrayList;
/*
 * Method EnterScore needs to be done
 */

public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Golfer(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(int strokes, int par){
        for (Observer observer: observers){
            observer.update(strokes, par);
        }
    }

    public void enterScore(int strokes, int par){
        notifyObserver(strokes, par);
    }

    public String getName(){
        return this.name;
    }
    
}
