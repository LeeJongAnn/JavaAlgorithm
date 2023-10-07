package com.company.Programmers.Level0.Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 뒤에서5등까지 {


    public static void main(String[] args) {

        int[] num_list = { 12, 4, 15, 46, 38, 1, 14 };
        solution(num_list);
    }

    public static List<Integer> solution(int[] num_list) {

        List<Integer> array = new ArrayList<Integer>();

        Arrays.sort(num_list,0,num_list.length);
        for (int i = 0; i < 5; i++) {
            array.add(num_list[i]);
        }
        for(Integer list : array) {
            System.out.print(list + " ");
        }

        return array;
    }
}

