package com.company.Day42;


import com.company.Day39.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class JadenCase만들기 {


    public static void main(String[] args) {

        String s = "3people unFollowed me";

        Solution sol = new Solution();
        sol.solution(s);
    }

    public String solution(String s) {
        String k = "";
        List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        for (String str : collect) {
            String[] split = str.split("");
            for (int i = 0; i < split.length; i++) {
                if (i == 0) {
                    String upperCase = split[i].toUpperCase();
                    k += upperCase;
                } else if (split[i].equals(split[i].toUpperCase())) {
                    String lowerCase = split[i].toLowerCase();
                    k += lowerCase;
                }

                else {
                    k += split[i];
                }

            }
            k += " ";
        }
        String substring = "";
        if (s.endsWith(" ")) {
            substring = k;


        } else if(s.endsWith("")) {
            substring = k.substring(0, k.length() - 1);
        }
//		List<String> collect2 = Arrays.stream(k.split(" ")).collect(Collectors.toList());
//		System.out.println(collect2);
//		String newnew = "";
//		for (String u : collect2) {
//			newnew += u + " ";
//		}
        System.out.println(substring);
        return substring;
    }
}