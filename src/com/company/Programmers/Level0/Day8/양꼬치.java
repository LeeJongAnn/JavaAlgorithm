package com.company.Programmers.Level0.Day8;

public class 양꼬치 {

    public int solution(int n, int k) {

        int sheep = 0;
        int drink = 0;
        int result = 0;
        if (n == 10) {
            sheep = n * 12000;
            drink = 2000 * (k - 1);
            result = sheep + drink;
        } else {
            int minus = n / 10;

            sheep = n * 12000;
            drink = 2000 * k;

            result = sheep + drink - minus * 2000;
        }

        return result;
    }
}
