package org.aiods;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapChallenge {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Object> cache = new ConcurrentHashMap<>();
        cache.put("111",Double.valueOf(5));
        cache.putIfAbsent("111","lol");
        cache.put("111", Integer.valueOf(4));
        cache.put("222",Integer.valueOf(4));
        System.out.println(cache);

    }
}
