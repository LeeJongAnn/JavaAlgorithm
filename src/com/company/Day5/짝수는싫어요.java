package com.company.Day5;

import java.util.ArrayList;
import java.util.List;

public class 짝수는싫어요 {
    public List<Integer> solution(int n) {
        int result = 0;
        List<Integer> array = new ArrayList<Integer>();
        for( int i = 0 ; i<=n; i++) {
            if(i % 2 != 0) {
                array.add(i);
            }
        }
        return array;
    }
}
