package com.company.Day2;

import java.util.ArrayList;
import java.util.List;

class 짝수홀수개수 {
    public List<Integer> solution(int[] num_list) {

        int even = 0;
        int odd = 0;
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        array.add(even);
        array.add(odd);
        return array;

    }
}