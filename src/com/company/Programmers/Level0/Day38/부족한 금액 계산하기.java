package com.company.Programmers.Level0.Day38;

class Solution {

    public static long sum = 0;
    public static long result = 0;

    public static void main(String[] args) {

        solution(3, 20, 4);
    }

    public static long solution(long price, long money, long count) {

        for (int i = 0; i < count; i++) {
            sum += price;
            System.out.println(sum);
            result += sum;
        }
        long finalResult = result - money;
        if (money == result) {
            return 0;
        } else if (money > result) {
            return 0;
        }
        System.out.println(finalResult);
        return finalResult;
    }
}