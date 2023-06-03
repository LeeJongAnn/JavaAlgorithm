package com.company.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 최댓값만들기2 {

    static int result = 0;

    public static void main(String[] args) {
        int[] numbser = { 0, -31, 24, 10, 1, 9 };
        solution(numbser);
    }

    public static int solution(int[] numbers) {

        List<Integer> intList = new ArrayList<>();

        for (Integer list : numbers) {
            intList.add(list);
        }

        Collections.sort(intList);
        System.out.println(intList);
        int first = intList.get(0);
        int second = intList.get(1);
        int last = intList.get(intList.size() - 1);
        int lastSecond = intList.get((intList.size() - 2));
        if (first * second > last * lastSecond) {
            result = first * second;
        } else if (first * second < last * lastSecond) {
            result = last * lastSecond;
        } else {
            result = last * lastSecond;
        }
        System.out.println(result);
        return result;
    }
}

