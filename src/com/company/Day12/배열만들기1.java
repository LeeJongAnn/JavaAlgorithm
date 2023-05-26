package com.company.Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열만들기1 {

    public List<Integer> solution(int n, int k) {

        int result = 1;
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i * k < n) {
                result = i * k;
                array.add(result);
            } else if( i * k == n){
                result = i*k;
                array.add(result);
            } else {
                break;
            }

        }
        return array;
    }
}

