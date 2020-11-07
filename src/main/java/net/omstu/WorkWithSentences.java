package main.java.net.omstu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkWithSentences {
    private String basicSentences;
    private String finalSentences;

    public WorkWithSentences(String basicSentences){
        this.basicSentences = basicSentences;
    }

    public void shuffleSentences(){
        String[] words = basicSentences.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append(word.charAt(0));
            sb.append(shuffle(word.substring(1, word.length()-1)));
            sb.append(word.charAt(word.length()-1));
            sb.append(" ");
        }
        finalSentences = sb.toString();
    }

    private String shuffle(String input){
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }

    public String getBasicSentences(){
        return basicSentences;
    }
    public String getFinalSentences(){
        return finalSentences;
    }
}


