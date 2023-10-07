package com.company.Programmers.Level0.Day28;

import java.util.ArrayList;
import java.util.List;

public class 잘라서배열로저장하기 {
    public static void main(String[] args) {

        String str = "abcdef123";
        solution(str, 3);
    }

    public static List<String> solution(String my_str, int n) {

        int arraySize = my_str.length() / n;
        int others = my_str.length() % n;
        System.out.println("arraySize: " + arraySize);
        System.out.println("others: " + others);

        int startIndex = 0;
        int endIndex = 0;
        List<String> array = new ArrayList<>();
        for (int i = 0; i <= arraySize; i++) {
            startIndex = n * i;
            endIndex += n;
            if (endIndex > my_str.length()) {
                endIndex = my_str.length();
                System.out.println("startIndex : " + startIndex);
                System.out.println("endIndex : " + endIndex);
                String substring = my_str.substring(startIndex, endIndex);
                array.add(substring);
            }
            else {
                System.out.println("startIndex : " + startIndex);
                System.out.println("endIndex : " + endIndex);
                String substring = my_str.substring(startIndex, endIndex);
                array.add(substring);
            }
        }
        String findNull = "";
        if(array.contains(findNull)) {
            array.remove(array.size()-1);
        }
        System.out.println(array);
        return array;
    }
}

