package chapter8;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        // create a string
        String str = "this is java code";
        String words[]=str.split(" ");
        String capitalizeStr="";

        for(String word:words){
            // Capitalize first letter
            String firstLetter=word.substring(0,1);
            // Get remaining letter
            String remainingLetters=word.substring(1);
            capitalizeStr+=firstLetter.toUpperCase()+remainingLetters+" ";
        }
        System.out.println(capitalizeStr);

    }
}
