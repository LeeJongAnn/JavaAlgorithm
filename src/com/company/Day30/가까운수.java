package com.company.Day30;

import java.util.*;
import java.util.stream.Collectors;

class 가까운수 {
    public static void main(String[] args) {
        int[] closer = { 1, 4, 2, 1 };
        solution(closer, 3);
    }

    public static int solution(int[] array, int n) {

        List<Integer> collect = Arrays.stream(array).sorted().boxed().collect(Collectors.toList());
        List<Integer> newArray = new ArrayList<>();
        System.out.println(collect);
        int number = 0;
        for (int i : collect) {
            number = n - i;
            int abs = Math.abs(number);
            newArray.add(abs);
        }
        Integer min = Collections.min(newArray);
        int indexOf = newArray.indexOf(min);
        Integer answer = collect.get(indexOf);
        System.out.println(answer);
        return answer;
    }
}