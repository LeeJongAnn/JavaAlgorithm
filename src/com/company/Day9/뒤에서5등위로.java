package com.company.Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 뒤에서5등위로 {

    public static void main(String[] args) {

        int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
        solution(num_list);
    }

    public static List<Integer> solution(int[] num_list) {

        List<Integer> array = new ArrayList<Integer>();

        Arrays.sort(num_list);
        for (int i = 4; i < num_list.length; i++) {
            array.add(num_list[i]);
        }
        for(Integer list : array) {
            System.out.print(list + " ");
        }
        return array;
    }
}

