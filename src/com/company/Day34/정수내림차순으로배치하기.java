package com.company.Day34;

import java.util.*;
import java.util.stream.Collectors;

class 정수내림차순으로배치하기 {

    public static void main(String[] args) {
        int n = 118372;
        solution(n);
    }

    public static long solution(long n) {

        String valueOf = String.valueOf(n);
        List<String> collect = Arrays.stream(valueOf.split("")).sorted().collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);
        String list = "";
        for (String str : collect) {
            list += str;
        }
        long parseLong = Long.parseLong(list);
        return parseLong;
    }
}