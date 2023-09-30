package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * Allows for user to play a game of Anagrams, finding arrangments of rearranged words. 
 * 
 * An anagram is a rearragment of an arranged words. There is a singleton meaning, only one
 * instance of the game is ran. 
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 30, 2023
 */

public class Game {

    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;


    /*
     * Ensures that only one Game class is constructed
     * 
     * Loads the HashMap with each difficulty, random is initiazlied 
     */

    private Game(){
        anagrams = new HashMap<>();
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
        rand = new Random();
    }

    /*
     * Loads for the class to be working so the class does not destory when complete 
     * 
     * 
     * @param game      The instantiation of the class is loaded
     */

    public static Game getInstance(){
        if(game == null){
            game = new Game();
        }
        return game;
    }

    /*
     * Loads a random anagram, the rearragnment is given to the user
     * 
     * The level is checked when this method is called, to determine the difficulty of the Anagram(3,4,or 5 letters).
     * 
     * @param currentAnagram.getQuestion()      Returns in string the current rearrangment of an Anagram
     */

    public String getQuestion(){
        checkLevel();
        currentAnagram = (anagrams.get(level)).get(rand.nextInt(anagrams.get(level).size()));
        return currentAnagram.getQuestion();
    }

    /*
     * Loads the current Difficulty the user is on
     * 
     *  This method is used when creating a question 
     * 
     */

    private void checkLevel(){
        if (score >= 10){
                level = Difficulty.HARD;
            }
            else if (score >= 6){
                level = Difficulty.MEDIUM;
            }
            else{
                level = Difficulty.EASY;
            }
    }

    /*
     * Allows user to see if their answer for a rearranged Anagram, matches an arragemnet of that Anagram
     * 
     * This allows the score to be updated: when the user's answer is right the score decreases, when the score
     * get's higher the score increases.
     * 
     * @pram boolean        returns true if the user's answer matches a correct Arragnemnt of the Anagram
     */

    public boolean isCorrect(String userAnswer){
        if (currentAnagram.isCorrect(userAnswer)){
            score++;
            return true;
        }
        score--;
        return false;
    }
    
    /*
     * Allows the user to see the current score the user is on
     * 
     * The score determines the current Difficulty the Anagram is displaying(3, 4, or 5 letters).
     * 
     * @return score        The current right answer's the user has minus their incorrect ones
     */

    public int getScore(){
        return score;
    }
    
}
