package com.company.Programmers.Level0.Day10;

public class 홀짝에따라다른값반환하기 {

    public int solution(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                if(i % 2 == 0) {
                    result += i * i;
                }
            } else if(n % 2 != 0) {
                if( i % 2 != 0) {
                    result += i;
                }
            }
        }
        return result;
    }
}

