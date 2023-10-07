package com.company.Programmers.Level0.Day34;

class 제곱근판별 {

    public static void main(String[] args) {

        solution(3);
    }

    public static long solution(long n) {
        double pow;
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            System.out.println(sqrt);
            if (Math.sqrt(n) == sqrt) {
                pow = Math.pow(sqrt + 1, 2);
                System.out.println(pow);
            } else {
                pow = -1;
            }
        } else {
            pow = -1;
        }
        System.out.println(pow);
        return (long) pow;
    }
}