package com.company.Day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 가운데글자가져오기 {

    public static void main(String[] args) {
        String s = "abcde";
        solution(s);
    }

    public static String solution(String s) {
        List<String> array = new ArrayList<>();
        List<String> collect = Arrays.stream(s.split("")).collect(Collectors.toList());
        int size = collect.size() / 2;
        String string = "";
        if (collect.size() % 2 == 0) {
            String two = collect.get(size - 1);
            String one = collect.get(size);
            string += two;
            string += one;
        } else {
            String stringCollect = collect.get(size);
            string += stringCollect;
        }
        System.out.println(string);
        return string;
    }
}