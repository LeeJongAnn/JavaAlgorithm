package com.company.Day4;

import java.util.ArrayList;
import java.util.List;

public class 문자반복출력하기 {

    public String solution(String my_string, int n) {
        char result;
        List<String> arrayList = new ArrayList<String>();
        String last;
        for(int i = 0; i<my_string.length(); i++) {
            result = my_string.charAt(i);
            last = Character.toString(result);
            for(int j = 0; j<n; j++) {
                arrayList.add(last);
            }

        }
        String str = "";
        for(String list : arrayList) {
            str += list;
        }

        return str;
    }
}
