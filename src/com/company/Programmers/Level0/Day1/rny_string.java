package com.company.Programmers.Level0.Day1;

import java.util.ArrayList;
import java.util.List;

class rny_string {

    public static void main(String[] args) {
        String my_string = "masterpiece";

        solution(my_string);
    }
    public static String solution(String rny_string) {
        String alp = "m";
        String[] split = rny_string.split("");
        List<String> array = new ArrayList<String>();
        for(String list : split){
            array.add(list);
        }
        String str = "";
        String addString = "rn";
        for(String temp : array){
            if(temp.equals(alp)){
                temp = addString;
            }
            str += temp;
        }
        System.out.println(str);
        return str;
    }
}
