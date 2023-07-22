package com.company.Day35;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class 나누어떨어지는숫자배열 {

    static long sum = 0;

    public static void main(String[] args) {
        int[] answer = { 3,2,6 };
        solution(answer, 10);
    }

    public static List<Integer> solution(int[] arr, int divisor) {

        List<Integer> collect = Arrays.stream(arr).filter(s -> s % divisor == 0).boxed().collect(Collectors.toList());
        Collections.sort(collect);
        if(collect.isEmpty()) {
            collect.add(-1);
        }
        System.out.println(collect);
        return collect;
    }
}