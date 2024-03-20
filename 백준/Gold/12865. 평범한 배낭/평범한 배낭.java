

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Integer dp[][];
    static int W[];
    static int V[];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String[] split = bf.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        W = new int[N];
        V = new int[N];


        dp = new Integer[N][M + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(N - 1, M));


    }

    static int knapsack(int i, int k) {

        if (i < 0) {
            return 0;
        }

        if (dp[i][k] == null) {

            if (W[i] > k) {
                dp[i][k] = knapsack(i - 1, k);
            } else {
                dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
            }
        }
        return dp[i][k];
    }


}