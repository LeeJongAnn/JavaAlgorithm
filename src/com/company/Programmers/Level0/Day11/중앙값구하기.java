package com.company.Programmers.Level0.Day11;

import java.util.Arrays;

public class 중앙값구하기{

    public static void main(String[] args) {

        int a[] = {1, 2, 7, 10, 11};

        solution(a);
    }
    public static int solution(int[] array) {
        int a = 0;
        Arrays.sort(array);
        int result = (array.length / 2);
        int returnResult = array[result];
        System.out.println(returnResult);
        return returnResult ;
    }
}

