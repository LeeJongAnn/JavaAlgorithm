package com.company.Programmers.Level0.Day14;

import java.util.ArrayList;
import java.util.List;

public class 암호해독 {

    public String solution(String cipher, int code) {
        char str;
        String result;
        List<String> array = new ArrayList<String>();
        for(int i = code-1; i<cipher.length(); i +=code) {

            str = cipher.charAt(i);
            result = Character.toString(str);
            array.add(result);
        }
        String strResult = "";
        for(String list : array) {
            strResult += list;
        }

        return strResult;
    }
}

