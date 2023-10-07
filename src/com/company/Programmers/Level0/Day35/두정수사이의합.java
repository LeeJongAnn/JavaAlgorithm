package com.company.Programmers.Level0.Day35;

class 두정수사이의합 {

    static long sum = 0;

    public static void main(String[] args) {
        long a = -10000000;
        long b = 10000000;
        solution(a, b);
    }

    public static long solution(long a, long b) {

        if (a > b) {
            for (long j = b; j <= a; j++) {
                sum += j;
            }
        } else if (a == b) {
            for (long j = b; j <= a; j++) {
                sum += j;
            }
        }

        else {
            for (long i = a; i <= b; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
        return (long) sum;
    }
}