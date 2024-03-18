

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int array[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);


        int prev = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            prev += array[i];
            result += prev;
        }
        System.out.println(result);
    }

}