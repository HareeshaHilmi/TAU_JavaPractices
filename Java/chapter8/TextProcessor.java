package chapter8;

import java.util.ArrayList;
import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {

        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("HeyWorld!It'sMeHaree");
    }

    /**
     * Splits a String int an array by tokenizing it.
     * Counts words and prints them
     * @param text Full String to be split
     */

    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);

        for (int i = 0 ; i < numberOfWords ; i++)
            System.out.println(words[i]);
    }

    public static void reverseString(String text){
        for (int i = text.length()-1 ; i >= 0 ; i--)
            System.out.print(text.charAt(i));
    }

    /**
     * // FOR JAVA 10
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */

    /*public static void  addSpaces(String text){
        var modifiedText = new StringBuilder(text);

        for (int i = 0 ; i < modifiedText.length() ; i++ ){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }*/

    public static void  addSpaces(String text){
        StringBuilder modifiedText = new StringBuilder(text);
        System.out.println("");

        for (int i = 0 ; i < modifiedText.length() ; i++ ){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }



}
