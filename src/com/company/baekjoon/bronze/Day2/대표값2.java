package com.company.baekjoon.bronze.Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class 대표값2 {

    static int average = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();

        for(int i = 0; i<5; i++){
            int result = Integer.parseInt(bf.readLine());
            average += result;
            array.add(result);
        }
        Collections.sort(array);
//        for (int j = 0; j < 5; j++) {
//            System.out.print(array.get(j) + " ");
//        }
//        System.out.println();
        System.out.println(average/5);
        System.out.println(array.get(array.size()/2));
    }

}