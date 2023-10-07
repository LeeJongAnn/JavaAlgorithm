package com.company.Programmers.Level0.Day36;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class 중복된문자제거 {

    public static void main(String[] args) {
        String s = "people";
        solution(s);
    }

    public static String solution(String my_string) {

        List<String> array = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            char charAt = my_string.charAt(i);
            String string = Character.toString(charAt);
            if (array.contains(string)) {
                continue;
            } else {
                array.add(string);
            }
        }
        String collect = array.stream().collect(Collectors.joining());
        System.out.println(collect);
        return collect;
    }
}