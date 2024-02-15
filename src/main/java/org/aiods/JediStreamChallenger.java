package org.aiods;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JediStreamChallenger {
    public static void main(String... args) {
        List<String> jediList=List.of("Yoda","Luke","Anakin","Obi Wan","Luke");
        jediList.stream()
                .skip(1)
                .filter(jedi->jedi.startsWith("Lu"))
                .limit(4)
                .distinct()
                .peek(System.out::println)

                .map(String::length)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
