package org.aiods;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstRepChar("evjxpnqgmvfjl"));
    }

    static String firstRepChar(String s) {
        var map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                if (map.containsKey(ch) && map.get(ch) == 2) {
                    return ch.toString();

                }
            } else {
                map.put(ch, 1);
            }

        }
        return "-1";
    }
}
