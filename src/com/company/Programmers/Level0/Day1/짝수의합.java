package com.company.Programmers.Level0.Day1;

public class 짝수의합 {

    public int solution(int n) {

        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

}
