package com.company.Programmers.Level0.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나머지가1이되는수찾기 {

    public static void main(String[] args) {

        solution(3);
    }

    public static int solution(int n) {

        int result = 0;
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {

            if (n % i == 1) {
                System.out.println(i);
                result = i;
                array.add(result);
            }
        }

        Collections.sort(array);
        int last = array.get(0);
        return last;
    }
}

