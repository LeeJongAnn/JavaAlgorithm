package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class 공바꾸기 {

    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");

        int num = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = i + 1;
        }
        int temp = 0;
        for (int i = 0; i < num2; i++) {

            String second = bf.readLine();
            String[] number = second.split(" ");

            int N = Integer.parseInt(number[0]);
            int M = Integer.parseInt(number[1]);

            temp = array[N-1];
            array[N-1] = array[M-1];
            array[M-1] = temp;

        }

        for(Integer result : array){
            System.out.print(result + " ");
        }
    }

}