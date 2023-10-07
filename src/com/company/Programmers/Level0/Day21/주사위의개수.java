package com.company.Programmers.Level0.Day21;

import java.util.ArrayList;
import java.util.List;

class 주사위의개수 {

    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        solution(box, 3);
    }
    public static int solution(int[] box, int n) {

        List<Integer> list = new ArrayList<>();
        int match= 1;
        int result = 1;
        for(int a : box) {
            result = a/n;
            match *= result;
            list.add(a);
        }
        System.out.println(list);
        System.out.println(match);
        return match;
    }
}