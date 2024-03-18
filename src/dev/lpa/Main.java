package dev.lpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos =
                Arrays.asList(aText, bText, cText, dText, eText);

        hellos.forEach(s-> System.out.println(s + " :" + s.hashCode()));


        // HashSet tracks dupes by their hashcode
        Set<String> mySet = new HashSet<>(hellos);

        // Two items: "Hello" and "hello"
        System.out.println("mySet = " + mySet);
        System.out.println("size: " + mySet.size());
    }
}