package com.example.wordscounter;

public class  TextCounter {
    public static int countWords(String s){

        int intWord = -1;
        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;

            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        if (s.length() > 0 && wordCount == 0) {
            return intWord;
        }
        else
            return wordCount;

    }

    public static int countChars(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
        }
        return count;
    }

}
