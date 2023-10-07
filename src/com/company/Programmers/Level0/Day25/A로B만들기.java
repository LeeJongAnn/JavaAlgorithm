package com.company.Programmers.Level0.Day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A로B만들기 {
    public static void main(String[] args) {

        String a = "allpe";
        String b = "apple";
        solution(a, b);
    }
    public static int solution(String before, String after) {

        List<String> listbefore = new ArrayList<String>();
        List<String> listafter = new ArrayList<String>();

        for (int i = 0; i < before.length(); i++) {
            char charAt = before.charAt(i);
            String b = Character.toString(charAt);
            listbefore.add(b);
        }

        for(int j = 0; j < after.length(); j++) {

            char charAt = after.charAt(j);
            String c = Character.toString(charAt);
            listafter.add(c);
        }
        Collections.sort(listbefore);
        System.out.println(listbefore);
        Collections.sort(listafter);
        System.out.println(listafter);
        if(listbefore.equals(listafter)) {
            return 1;
        } else {
            return 0;
        }

    }
}

