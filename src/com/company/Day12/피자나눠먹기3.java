package com.company.Day12;

public class 피자나눠먹기3 {

    public int solution(int slice, int n) {
        int result = 0;
        if(n % slice == 0) {
            result = n / slice;
        } else {
            result = (n / slice) + 1;
        }
        return result;
    }
}

