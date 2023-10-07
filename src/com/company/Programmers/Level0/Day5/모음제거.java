package com.company.Programmers.Level0.Day5;

import java.util.ArrayList;
import java.util.List;

public class 모음제거 {
    public String solution(String my_string) {
        char temp;
        String result = "";

        List<String> array = new ArrayList<String>();

        for (int i = 0; i < my_string.length(); i++) {
            temp = my_string.charAt(i);
            result = Character.toString(temp);
            if (result.equals("a")) {
                array.add("");
            } else if (result.equals("e")) {
                array.add("");
            } else if (result.equals("i")) {
                array.add("");
            } else if (result.equals("o")) {
                array.add("");
            } else if (result.equals("u")) {
                array.add("");
            } else {
                array.add(result);
            }

        }
        String str = "";
        for (String list : array) {
            str += list;
        }

        return str;

    }
}
