package com.company.baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class 직사각형탈출 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");
        List<Integer> array = new ArrayList<>();

        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int w = Integer.parseInt(split[2]);
        int h = Integer.parseInt(split[3]);

        int num1 = x - 0;
        int num2 = y - 0;

        int num3 = w - x;
        int num4 = h - y;

        array.add(num1);
        array.add(num2);
        array.add(num3);
        array.add(num4);

        Integer min = Collections.min(array);
        System.out.println(min);
    }
}