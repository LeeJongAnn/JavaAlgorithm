package com.company.Programmers.Level0.Day39;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 내적 {

    public static int sum = 0;
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int [] b = {-3,-1,0,2};

        solution(a,b);
    }

    public static int solution(int[] a, int[] b) {
        List<Integer> collectA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> collectB = Arrays.stream(b).boxed().collect(Collectors.toList());

        for(int i = 0 ; i<collectA.size(); i++){
            sum += collectA.get(i) * collectB.get(i);
        }
        System.out.println(sum);
        return sum;
    }
}
