

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static int array[];

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        String[] split = s.split(" ");


        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        array = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int temp = 0 ;
        int result = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k< N; k++) {
                    temp = array[i] + array[j] + array[k];
                    if (temp == M) {
                        result = temp;
                    }

                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
