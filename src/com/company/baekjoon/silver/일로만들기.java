package com.company.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 일로만들기 {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        dp = new Integer[num + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(num));
    }

    static int recur(int N) {
        if (dp[N] == null) {
            if (N % 6 == 0) {
                dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 2), recur(N / 3))) + 1;
            } else if (N % 3 == 0) {
                dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
            }
            else if (N % 2 == 0) {
                dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
            } else {
                dp[N] = recur(N - 1) + 1;
            }
        }
//        System.out.println("dp[" + N +"]" + " = " + dp[N]);
        return dp[N];
    }
}