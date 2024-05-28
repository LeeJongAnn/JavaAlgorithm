

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] split = bf.readLine().split(" ");

        int E = Integer.parseInt(split[0]);
        int S = Integer.parseInt(split[1]);
        int M = Integer.parseInt(split[2]);

        int e = 0;
        int s = 0;
        int m = 0;

        int answer = 0;

        while (true) {
            e++;
            s++;
            m++;

            answer++;

            if (e > 15) {
                e = 1;
            }
            if (s > 28) {
                s = 1;
            }
            if (m > 19) {
                m = 1;
            }

            if (e == E && s == S && m == M) {
                break;
            }
        }

        System.out.println(answer);
    }

}