package org.aiods;

import java.util.Arrays;
import java.util.HashMap;

public class StringHasAllUniqueChars {
    public static void main(String[] args) {
        System.out.println(isUniqueChars("Renea"));
    }

    static  boolean isUniqueChars(String input){

//        HashMap<Character,Integer> map= new HashMap<>();
//        for (int i = 0; i < input.length(); i++) {
//            Character ch=input.charAt(i);
//            if (map.containsKey(ch)){
//                map.put(ch,map.get(ch)+1);
//            }else {
//                map.put(ch,1);
//
//            }
//
//        }
//        return !map.values().stream().anyMatch(value->value>1);
        char[] chars=input.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < input.length()-1; i++) {
            if (chars[i]==chars[i+1]){
                return  false;
            }
        }
        return  true;
    }
}
