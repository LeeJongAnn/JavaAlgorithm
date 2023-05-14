package com.company.Day4;

import java.util.Arrays;

public class 최댓값만들기1 {

    public int solution(int[] numbers) {
        int temp = 0;
        int second = 0;
        int result = 0;
        Arrays.sort(numbers);
        temp = numbers[numbers.length-1];
        second = numbers[numbers.length - 2];
        result = temp * second;
        return result;
    }

}
