package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {

    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    private Game(){
        anagrams = new HashMap<>();
        anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
        anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
        anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
        rand = new Random();
    }

    public static Game getInstance(){
        if(game == null){
            game = new Game();
        }
        return game;
    }

    public String getQuestion(){
        checkLevel();
        currentAnagram = (anagrams.get(level)).get(rand.nextInt(anagrams.get(level).size()));
        return currentAnagram.getQuestion();
    }

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

    public boolean isCorrect(String userAnswer){
        if (currentAnagram.isCorrect(userAnswer)){
            score++;
            return true;
        }
        score--;
        return false;
    }

    public int getScore(){
        return score;
    }
    
}
