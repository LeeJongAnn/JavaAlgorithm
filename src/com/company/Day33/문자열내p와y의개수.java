package com.company.Day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class 문자열내p와y의개수 {

    static int pcount = 0;
    static int ycount = 0;

    public static void main(String[] args) {

        solution("pPoooyY");
    }

    public static boolean solution(String s) {
        String p = "p";
        String y = "y";
        boolean answer;
        char charAt;
        String collect = Arrays.stream(s.split("")).collect(Collectors.joining());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < collect.length(); i++) {
            charAt = collect.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            String string = Character.toString(lowerCase);

            if (string.equals(p)) {
                pcount += 1;
            } else if (string.equals(y)) {
                ycount += 1;
            }
        }
        if (pcount == ycount) {
            answer = true;
            System.out.println(true);
        } else {
            answer = false;
            System.out.println(false);
        }
        System.out.println(pcount);
        return answer;
    }
}