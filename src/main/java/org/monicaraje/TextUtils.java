package org.monicaraje;

import java.util.Optional;
import java.util.stream.Stream;

public class TextUtils {

    public static String getLongestWord(String text){

        //throw new UnsupportedOperationException("Not implemented Yet initial and  more");

        if(text == null){
            return text;
        }
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
}
