package com.company.Programmers.Level0.Day8;

public class 피자나눠먹기 {

    public int solution(int n) {
        int result = 0;
        if (n % 7 != 0) {
            result = (n / 7) + 1;
        } else {
            result = n / 7;
        }
        return result;
    }
}

