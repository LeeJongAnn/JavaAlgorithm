package com.company.Day26;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        String a = "baaaab";
        solution(a);
    }

    public static String solution(String s) {

        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        List<String> collect = Arrays.stream(s.split("")).collect(Collectors.toList());

        for (String list : collect) {
            hash.put(list, hash.getOrDefault(list, 0) + 1);
        }

        String str = "";
        for (String key : hash.keySet()) {
            if (hash.get(key).equals(1)) {
                str += key;
            }
        }
        String collect2 = Stream.of(str.split("")).sorted().collect(Collectors.joining());

        System.out.println(collect2);
        return collect2;

    }
}

