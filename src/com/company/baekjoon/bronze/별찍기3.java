package com.company.baekjoon.bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 별찍기3 {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= num; i++) {
            for (int k = i; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}