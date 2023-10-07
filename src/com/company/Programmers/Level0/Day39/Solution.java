package com.company.Programmers.Level0.Day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {

        String s = "try hello world";
        solution(s);
    }

    public static String solution(String s) {

        List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        List<String> array = new ArrayList<>();
        System.out.println(collect);

        for (int i = 0; i < collect.size(); i++) {
            String s1 = collect.get(i);
            if (i % 2 == 0) {
                for (int j = 0; j < s1.length(); j++) {
                    if (j % 2 == 0) {
                        char c = s1.charAt(j);
                        String string = Character.toString(c);
                        String upperCase = string.toUpperCase();
                        array.add(upperCase);
                    } else  {
                        char h = s1.charAt(j);
                        String string = Character.toString(h);
                        String lowerCase = string.toLowerCase();
                        array.add(lowerCase);
                    }
                }
            } else {
                for( int k = 0; k<s1.length(); k++){
                    if (k % 2 == 0) {
                        char c = s1.charAt(k);
                        String string = Character.toString(c);
                        String upperCase = string.toUpperCase();
                        array.add(upperCase);
                    } else  {
                        char h = s1.charAt(k);
                        String string = Character.toString(h);
                        String lowerCase = string.toLowerCase();
                        array.add(lowerCase);
                    }
                }
            }
        }
        List<String> collect1 = array.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);
//        String list = "";
//        for(String str : collect1){
//            list += str;
//        }
//        System.out.print(list);
        return s;
    }
}
