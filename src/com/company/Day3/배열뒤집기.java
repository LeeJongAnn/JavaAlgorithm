package com.company.Day3;

import java.util.ArrayList;
import java.util.List;

public class 배열뒤집기 {

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        solution(num);
    }

    public static List<Integer> solution(int[] num_list) {

        int len = num_list.length-1;
        List<Integer> array = new ArrayList<Integer>();
        for (int i = len; i >= 0; i--) {
            array.add(num_list[i]);
        }
        System.out.println(array);
        return array;

    }
}
