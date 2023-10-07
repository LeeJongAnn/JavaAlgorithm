package com.company.Programmers.Level0.Day29;

import java.util.ArrayList;
import java.util.List;

class 분수의덧셈 {
    public static void main(String[] args) {

        solution(9, 2, 1, 3);
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    public static List<Integer> solution(int numer1, int denom1, int numer2, int denom2) {
        List<Integer> array = new ArrayList<>();

        int denominator = denom1 * denom2;
        int newnumer1 = numer1 * denom2;
        int newnumer2 = numer2 * denom1;
        int numerator = newnumer2 + newnumer1;
        int gcd = getGCD(denominator, numerator);
        int gcddenom = 0;
        int numgcd = 0;
        if (gcd != 0) {
            gcddenom = denominator / gcd;
            numgcd = numerator / gcd;
        }
        System.out.println("denominator : " + gcddenom);
        System.out.println("numerator : " + numgcd);
        array.add(numgcd);
        array.add(gcddenom);
        System.out.println(array);
        return array;
    }

}