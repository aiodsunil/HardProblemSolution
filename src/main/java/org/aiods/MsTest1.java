package org.aiods;

import java.util.HashMap;
import java.util.IllegalFormatCodePointException;

public class MsTest1 {
    public int findnoOfMovechars(String input) {

        int numberOfMove=0;
        var map= new HashMap<Character,Integer>();

        for (int i = 0; i < input.length(); i++) {

            Character ch= input.charAt(i);
            if(ch=='A' || ch=='B' || ch=='N'){
                if (map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }

            }

        }
          while (true){

              if ((map.containsKey('A') && map.containsKey('B') && map.containsKey('N') &&
                      map.get('A')>=3 &&  map.get('B')>=1 &&  map.get('N')>=2)){
                   map.put('A', map.get('A')-3);
                   map.put('B', map.get('B')-1);
                   map.put('N', map.get('N')-2);
                  numberOfMove++;
              }else{
                  break;
              }
          }

        return  numberOfMove;
    }
}
