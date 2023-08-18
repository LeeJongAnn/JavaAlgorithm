package com.company.Day46;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class 소인수분해{


    public static void main(String[] args) {
        int n = 12;
        solution(n);
    }

    public static int[] solution(int n) {

        List<Integer> array = new ArrayList<>();
        int i = 2;
        while (n >= 2) {
            if (n % i == 0) {
                array.add(i);
                n = n / i;
                System.out.println("가능합니다." + n);
            } else {
                i++;
                if (n % i == 0) {
                    array.add(i);
                    n = n / i;
                    System.out.println(n);
                }
            }
        }
        int[] array1 = array.stream().distinct().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array1));
        return array1;
    }


}

