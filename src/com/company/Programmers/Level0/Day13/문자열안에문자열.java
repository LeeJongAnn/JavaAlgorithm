package com.company.Programmers.Level0.Day13;

public class 문자열안에문자열 {

    public int solution(String str1, String str2) {

        if(str1.contains(str2) == true) {
            return 1;
        } else {
            return 2;
        }
    }
}

