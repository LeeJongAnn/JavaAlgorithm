package com.company.Programmers.Level0.Day34;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class k의개수 {

    static int count = 0;
    public static void main(String[] args) {
        solution(10, 10, 0);
    }

    public static int solution(int i, int j, int k) {

        List<Integer> integerArray = new ArrayList<>();

        for (int z = i; z <= j; z++) {
            integerArray.add(z);
        }
        List<String> collect2 = integerArray.stream().map(String::valueOf).collect(Collectors.toList());
        for (String list : collect2) {
            String[] split = list.split("");
            for (String str : split) {
                if (str.contains(String.valueOf(k))) {
                    count += 1;
                }
            }
        }
        return count;
    }
}