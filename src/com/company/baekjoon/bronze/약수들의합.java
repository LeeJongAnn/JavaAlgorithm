package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class 약수들의합 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            List<Integer> array = new ArrayList<>();
            int sum = 0;
            String result = "";
            int num = Integer.parseInt(bf.readLine());
            if (num == -1) {
                break;
            }
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    result += ((sum > 1) ? " + " : "") + i;
                    array.add(i);
                }
            }
            System.out.println(num + (sum == num ? " = " + result : " is NOT perfect."));
        }
    }

}