package com.company.Day6;

import java.util.ArrayList;
import java.util.List;

public class 숨어있는숫자의덧셈 {
    public int solution(String my_string) {

        String intStr = my_string.replaceAll("[^0-9]", "");
        char a;
        String result;
        List<String> array = new ArrayList<String>();
        for (int i = 0; i < intStr.length(); i++) {
            a = intStr.charAt(i);
            result = Character.toString(a);
            array.add(result);
        }
        int sum = 0;
        for (String list : array) {
            sum += Integer.parseInt(list);
        }
        return sum;
    }
}
