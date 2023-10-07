package com.company.Programmers.Level0.Day15;

import java.util.stream.IntStream;

public class 약수구하기 {

    public int[] solution(int n) {
        return IntStream.rangeClosed(1	, n).filter(i-> n % i == 0).toArray();
    }
}

