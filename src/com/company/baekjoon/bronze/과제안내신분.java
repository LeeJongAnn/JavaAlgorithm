package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class 과제안내신분 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            int number = Integer.parseInt(bf.readLine());
            array.add(number);
        }

        Collections.sort(array);

        int[] newrray = new int[30];

        for (int k = 1; k <= 30; k++) {

            if (array.contains(k)) {
                newrray[k-1] = k;
            } else {
                System.out.println(k);
            }
        }
    }

}