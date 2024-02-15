package org.aiods;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;

public class NumberOfMoveToFindString {


    public static void main(String[] args) {
        String input="NAABXXAN";//should return 1 ,1->B,3->A,2 ->N
         input="NAANAAXNABABYNNBZ";//should return 2 ,1->B,3->A,2 ->N
         input="QABAAAWOBL";//should return 0 ,1->B,3->A,2 ->N
        int result= countMoveChars(input);
        System.out.println(result);
    }

    static int countMoveChars(String input) {
        var map= new HashMap<Character,Integer>();
        for (int i = 0; i <input.length() ; i++) {
            Character ch=input.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        int counter=0;
        while (true){
            if (
                    (map.containsKey('A') && map.containsKey('B')
                    && map.containsKey('N')) &&
                    (map.get('A')>=3
                    && map.get('B')>=1
                     && map.get('N')>=2)){
                map.put('A',map.get('A')-3);
                map.put('B',map.get('B')-1);
                map.put('N',map.get('N')-2);
                counter++;
            }else {
                break;
            }
        }

        return counter;
    }
}
