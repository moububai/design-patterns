package singleton;

import java.util.ArrayList;

/*
 * A new anagram is created, that is comparable 
 * 
 * An anagram is a word with the letters rearranged
 * question - rearranged word
 * answer - arranged word
 * 
 * @author Cameron Reyes
 * @version 1.0 build Sept 30, 2023
 */
public class Anagram {

    private String question;
    private ArrayList<String> answers;

    /*
     * Creates an anagram given the rearrangment, and the corresponding arrangmenets
     * 
     * An anagram is a word with the letters rearranged
     * 
     * @param question       The rearranged wording of the Anagram
     * @param answer         The arranged wording(s) of the Anagram. Multiple
     */

    public Anagram(String question, ArrayList<String> answers){
        this.question = question;
        this.answers = answers;
    }

    /*
     * Allows user to see the rearrangement of the Anagram
     * 
     * @return question     The rearranged wording of the Anagram
     */

    public String getQuestion(){
        return question;
    }

    /*
     * Allow's user to see if their answer is a valid arrangment of the Anagram 
     * 
     * The valid arragment of the Anagram is contained in the Arraylist answers, this case is not
     * case sensitive.
     * 
     * @return boolean      returns True if the user's answer is a match with the arranged Anagrams
     */

    public boolean isCorrect(String userAnswer){
        for(String answer: answers){
            if (answer.toLowerCase().equals(userAnswer.toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
}
