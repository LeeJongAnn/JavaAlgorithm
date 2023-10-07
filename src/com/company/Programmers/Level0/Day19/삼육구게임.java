package com.company.Programmers.Level0.Day19;

import java.util.ArrayList;
import java.util.List;

public class 삼육구게임 {

    public int solution(int order) {

        String parseint = String.valueOf(order);
        String num = "";
        String three = "3";
        String six = "6";
        String nine = "9";

        int count = 0;

        List<String> array = new ArrayList<>();
        for (int i = 0; i < parseint.length(); i++) {
            char charAt = parseint.charAt(i);
            String string = Character.toString(charAt);
            if (string.equals(three)) {
                count += 1;
            } else if (string.equals(six)) {
                count += 1;
            } else if (string.equals(nine)) {
                count += 1;
            }
            array.add(string);
        }
        return count;
    }
}

