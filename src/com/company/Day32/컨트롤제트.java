package com.company.Day32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class 컨트롤제트 {

    static int sum = 0;
    static String call = "Z";
    static int add = 0;

    public static void main(String[] args) {
        String s = "10 Z 20 Z 1";
        solution(s);
    }

    public static int solution(String s) {
        List<Integer> array = new ArrayList<>();
        List<String> collect = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        Stack<String> stackCollect = new Stack<String>();
        int parseInt = 0;
        for (int i = 0; i < collect.size(); i++) {
            String string = collect.get(i);
            if(string.equals("Z")) {
                sum -= Integer.parseInt(collect.get(i-1));
            } else {
                add = Integer.parseInt(string);
                sum += add;
            }
        }
        return sum;
    }
}