package com.company.Day8;

import java.util.Arrays;

public class 삼각형의완성조건 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int result = 0;

        if(sides[0]+sides[1]>sides[2]) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}
