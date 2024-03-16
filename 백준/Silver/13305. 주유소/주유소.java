

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int dist[] = new int[N - 1];
        int cost[] = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        for (int i = 0; i < N-1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine()," ");
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }
 

        int minCost = cost[0];
        int sum = 0;
        for (int i = 0; i < N-1; i++) {

            if (minCost > cost[i]) {
                minCost = cost[i];
            }
            sum += minCost * dist[i];

        }
        System.out.println(sum);
    }

}