package com.company.Day42;

import com.company.Day39.Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class 최대값최소값 {

    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        Solution sol = new Solution();
        sol.solution(s);
    }

    public String solution(String s) {
        List<Integer> collect = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toList());
        Integer max = Collections.max(collect);
        System.out.println(max);
        Integer min = Collections.min(collect);
        System.out.println(min);
        String list = "";

        list += min;
        list += " ";
        list += max;
        System.out.println(list);
        return list;
    }
}