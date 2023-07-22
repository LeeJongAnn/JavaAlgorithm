package com.company.Day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class 진료순서정하기 {
    public static void main(String[] args) {
        int[] array = { 3, 76, 24 };
        solution(array);
    }

    public static int[] solution(int[] emergency) {
        List<Integer> collect = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        System.out.println(collect);
        int[] array = new int[emergency.length];
        collect.sort(Comparator.reverseOrder());
        System.out.println(collect);

        for (int i = 0; i < collect.size(); i++) {
            array[i] = collect.indexOf(emergency[i]) + 1;
        }
        return array;
    }

}