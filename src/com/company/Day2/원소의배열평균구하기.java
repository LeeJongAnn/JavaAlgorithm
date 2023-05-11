package com.company.Day2;

class 원소의배열평균구하기 {
    public double solution(int[] numbers) {
        double result = 0;
        for(int i = 0; i<numbers.length; i++) {
            result += numbers[i];

        }
        double last = result / numbers.length;
        return last;
    }
}