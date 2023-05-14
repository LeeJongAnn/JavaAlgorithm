package com.company.Day5;

public class 자릿수더하기 {
    public int solution(int n) {

        String str = String.valueOf(n);
        int result = 0;
        char a;
        int b;
        for(int i = 0; i<str.length(); i++) {
            a = str.charAt(i);
            b = Character.getNumericValue(a);
            result += b;
        }

        return result;

    }
}
