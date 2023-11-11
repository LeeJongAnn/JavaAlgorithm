package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class 주사위세개 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");

        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);
        int num3 = Integer.parseInt(split[2]);
        List<Integer> array = new ArrayList<>(List.of(num1, num2, num3));

        int result = 0;
        if (num1 == num2 && num1 == num3) {
            result = 10000 + ( num1 * 1000 );
            System.out.println(result);
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            if (num1 == num2) {
                result = (num2 * 100) + 1000;
                System.out.println(result);
            } else if (num1 == num3) {
                result = (num1 * 100) + 1000;
                System.out.println(result);
            } else if (num2 == num3) {
                result = (num2 * 100) + 1000;
                System.out.println(result);
            } else if (num1==num3){
                result = (num1 * 100) + 1000;
                System.out.println(result);
            }
        } else {
            Integer max = Collections.max(array);
            result = max * 100;
            System.out.println(result);
        }

    }
}