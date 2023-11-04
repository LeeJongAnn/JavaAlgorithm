package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class 상수 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();
        String s = bf.readLine();
        String[] s1 = s.split(" ");

        for (int i = 0; i < s1.length; i++) {
            Stack<String> stack = new Stack<>();
            String[] split = s1[i].split("");
            for (String str : split) {
                stack.add(str);
            }
            String result = "";
            int size = stack.size();
            for (int k = 0; k < size; k++) {
                String pop = stack.pop();
                result += pop;
            }
            array.add(Integer.parseInt(result));

        }
        Integer max = Collections.max(array);
        System.out.println(max);
    }
}