package com.company.Day4;

import java.util.ArrayList;
import java.util.List;

class 특정문자제거하기 {
    public String solution(String my_string, String letter) {

        char temp;
        String result;
        List<String> array = new ArrayList<String>();
        for (int i = 0; i < my_string.length(); i++) {
            temp = my_string.charAt(i);
            result = Character.toString(temp);
            array.add(result);
        }

        String str = "";
        for (String list : array) {
            if (list.equals(letter)) {
                str += "";
            } else {
                str += list;
            }

        }
        return str;
    }
}
