package com.company.baekjoon.bronze.Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 윤년 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String readLine = bf.readLine();

        int number = Integer.parseInt(readLine);

        if (number % 4 == 0 && number % 100 != 0) {
            System.out.println("1");
        } else if (number % 400 == 0) {
            System.out.println("1");
        } else {

            System.out.println("0");

        }
    }

}