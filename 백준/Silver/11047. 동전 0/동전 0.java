

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = bf.readLine();
        String[] split = s.split(" ");

        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int coin[] = new int[N];

        /*
        *  배열을 통해서 코인의 값을 입력 받는다.
        * */

        for (int i = 0; i < N; i++) {
            coin[i] =Integer.parseInt(bf.readLine());
        }
        int result = 0;
        int sum = 0;
        for (int i = N-1; i >= 0; i--) {

            if (coin[i] <= M) {
                sum += M / coin[i];
                M = M % coin[i];
            }
        }
            System.out.println(sum);


    }

}