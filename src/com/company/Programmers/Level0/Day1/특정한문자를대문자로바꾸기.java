package com.company.Programmers.Level0.Day1;

import java.util.ArrayList;
import java.util.List;

class 특정한문자를대문자로바꾸기 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        solution(my_string, alp);
    }

    public static String solution(String my_string, String alp) {

        List<String> array = new ArrayList<String>();
        String[] input = my_string.split("");

        for(String list : input) {
            array.add(list);
        }

        String str = "";
        for(String temp : array) {
            if(temp.equals(alp)) {
                temp = alp.toUpperCase();
            }
            str += temp;
        }
        System.out.println(str);
        return str;
    }
}