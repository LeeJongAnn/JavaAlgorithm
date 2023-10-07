package com.company.Programmers.Level0.Day6;

public class 대문자와소문자 {
    public String solution(String my_string) {
        char a;
        String b;
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            a = my_string.charAt(i);
            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            } else {
                a = Character.toUpperCase(a);
            }
            b = Character.toString(a);
            result += b;
        }
        return result;
    }
}
