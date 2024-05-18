

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static char[] str1;
    static char[] str2;

    static Integer dp[][];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        str1 = bf.readLine().toCharArray();
        str2 = bf.readLine().toCharArray();


        dp = new Integer[str1.length][str2.length];


        System.out.println(LCS(str1.length-1, str2.length-1));


    }

    static int LCS(int x, int y) {

        if (x == -1 || y == -1) {
            return 0;
        }

        if (dp[x][y] == null) {
            if (str1[x] == str2[y]) {
                dp[x][y] = LCS(x-1,y-1) + 1;
            } else {
                dp[x][y] = Math.max(LCS(x - 1, y), LCS(x, y - 1));
            }
        }
        return dp[x][y];
    }

}