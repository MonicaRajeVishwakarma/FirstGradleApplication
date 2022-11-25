package org.monicaraje;

import java.util.Optional;
import java.util.stream.Stream;



public class TextUtils {

    /**
     * This method searches for the longest word in
     * a given string.
     * It will split the String on all spaces and
     * removes all punctuation characters (matching
     * the pattern "[:;,.?!]"). If multiple words
     * have the same length, it will return the
     * first of these.
     * @param text the text to analyze
     * @return longest the longest word
     * @throws IllegalArgumentException when
     *    a null value, an empty string or a single space is passed
     */
    public static String getLongestWord(String text){

        //throw new UnsupportedOperationException("Not implemented Yet initial and  more");
        if(isIllegalInput(text)){
            throw  new IllegalArgumentException("Text is empty or null");
        }
        text = stripPunctuationCharacters(text);
        String tempText[] = text.split(" ");
        int currLen, maxLen = tempText[0].length();
        currLen = maxLen;
        String longestWord = null;
        for(String s : tempText){
            currLen = s.length();
            if(currLen > maxLen){
                maxLen = currLen;
                longestWord = s;
            }
        }


        //Java 8 in Functional Programming way
        //Change the signature of the method ? for alphanumeric number, "", " ", "foo bar 1234", null,"foo bar 12! "
        //Boundary Condition - TempText null, Has just 1 element, Has large of elements
        Optional<String> findFirst = Stream.of(tempText).sorted
                ((one,two) -> Integer.compare(two.length(),one.length())).findFirst();

        longestWord = findFirst.get();
        System.out.println(longestWord);
        return  longestWord;

    }

    public static boolean isIllegalInput(String text){
        return null==text || text.isEmpty() || text.equals(" ");
    }

    public static String stripPunctuationCharacters(String text){
        return text.replaceAll("[?.:;,]]","");
    }
}