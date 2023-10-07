package com.company.Programmers.Level0.Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String str = "";
        char b;
        List<Character> tt = new ArrayList<Character>();

        for (int i = 0; i < a.length(); i++) {
            b = a.charAt(i);
            if (Character.isUpperCase(b)) {
                b = Character.toLowerCase(b);
                tt.add(b);
            } else if (Character.isLowerCase(b)) {
                b = Character.toUpperCase(b);
                tt.add(b);
            }
        }

        for (char list : tt) {
            str += list;
        }
        System.out.println(str);
    }
}
