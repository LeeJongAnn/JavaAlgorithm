package com.company.Day17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 문자열정렬하기2 {

    public String solution(String my_string) {
        char a;
        String str = "";
        List<String> array = new ArrayList<String>();

        for (int i = 0; i < my_string.length(); i++) {
            a = my_string.charAt(i);

            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
                array.add(String.valueOf(a));
            } else {
                array.add(String.valueOf(a));
            }
        }
        Stream<String> collectionStream = array.stream();
        List<String> changeList = collectionStream.sorted().collect(Collectors.toList());

        for (String b : changeList) {
            str += b;
        }

        return str;
    }
}

