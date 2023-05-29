package com.company.Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class 약수구하기 {

    public int[] solution(int n) {
        return IntStream.rangeClosed(1	, n).filter(i-> n % i == 0).toArray();
    }
}

