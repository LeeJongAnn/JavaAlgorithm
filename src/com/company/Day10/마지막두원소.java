package com.company.Day10;

import java.util.ArrayList;
import java.util.List;

public class 마지막두원소 {

    public List<Integer> solution(int[] num_list) {
        int result = 0;

        List<Integer> array = new ArrayList<Integer>();

        Integer num;
        for(Integer list : num_list) {
            array.add(list);
        }

        if(num_list[num_list.length-1]> num_list[num_list.length-2]) {
            result = num_list[num_list.length-1] - num_list[num_list.length-2];
            array.add(result);
        } else if (num_list[num_list.length-1]<= num_list[num_list.length-2]) {
            result = num_list[num_list.length-1] * 2;
            array.add(result);
        }
        return array;
    }
}

