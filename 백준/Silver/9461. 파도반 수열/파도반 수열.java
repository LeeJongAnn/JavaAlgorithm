

import java.io.*;
import java.util.*;

public class Main {


    static Long[] dp = new Long[101];


    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;


        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(bf.readLine());
            sb.append(find(K)).append("\n");
        }

        System.out.println(sb);


    }

    static Long find(int H) {

        if (dp[H] == null) {
            dp[H] = find(H - 2) + find(H - 3);
        }
        return dp[H];
    }

}