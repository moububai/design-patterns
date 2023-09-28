package singleton;

import java.util.ArrayList;

public class Anagram {

    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answers){
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion(){
        return question;
    }

    public boolean isCorrect(String userAnswer){
        for(String answer: answers){
            if (answer.equals(userAnswer)){
                return true;
            }
        }
        return false;
    }
    
}
