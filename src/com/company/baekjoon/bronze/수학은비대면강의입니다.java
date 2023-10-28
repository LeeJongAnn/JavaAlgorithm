package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수학은비대면강의입니다 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String numberList = bf.readLine();
        String[] split = numberList.split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);
        int e = Integer.parseInt(split[4]);
        int f = Integer.parseInt(split[5]);

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                    int first = i;
                    int second = j;
                    System.out.println(first + " " + second);
                }
            }
        }
    }
}