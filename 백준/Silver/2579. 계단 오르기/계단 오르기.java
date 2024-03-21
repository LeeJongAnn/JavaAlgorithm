

import java.io.*;
import java.util.*;

public class Main {

    static int arr[];
    static Integer dp[];
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        arr = new int[N+1];
        dp = new Integer[N+1];


        for (int i = 1; i <= N; i++) {
            arr[i]= Integer.parseInt(bf.readLine());
        }
        dp[0] = arr[0];
        dp[1] = arr[1];

        if (N >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(find(N));
    }

    static int find(int i) {

        if (dp[i] == null) {
            dp[i] = Math.max(find(i - 2), find(i - 3) + arr[i - 1]) + arr[i];
        }

        return dp[i];
    }



}