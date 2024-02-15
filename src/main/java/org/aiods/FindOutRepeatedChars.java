package org.aiods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindOutRepeatedChars {
    public static void main(String[] args) {
       String name="Hellmmmpppkkkk";
        Map<Character,Integer> maxRepeatedChars = new HashMap<>();
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (maxRepeatedChars.get(c)==null){
                maxRepeatedChars.put(c,1);
            }else{
                int maxValue = maxRepeatedChars.get(c);
                maxRepeatedChars.put(c,maxValue+1);
            }
        }
        char key= Collections.max(maxRepeatedChars.entrySet(),Map.Entry.comparingByValue()).getKey();
        System.out.println("Max key "+key);
    }
}
