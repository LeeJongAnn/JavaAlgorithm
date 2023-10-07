package com.company.Programmers.Level0.Day51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

class 나머지 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int parseInt = Integer.parseInt(st.nextToken());
            int other = parseInt % 42;
            array.add(other);
        }
        List<Integer> collect = array.stream().distinct().collect(Collectors.toList());
        System.out.println(collect.size());
    }
}