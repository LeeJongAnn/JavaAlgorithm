

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String[] split = bf.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        System.out.println(array[array.length-M]);

    }


}