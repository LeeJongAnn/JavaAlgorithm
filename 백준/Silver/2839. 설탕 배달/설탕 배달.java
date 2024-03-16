

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            for (int j = 0; j < 5000; j++) {
                if (i * 3 + j * 5 == N) {
                    result = i+j;
                    array.add(result);
                }
            }
        }

        if (array.isEmpty()) {
            System.out.println("-1");

        } else {
            Integer min = Collections.min(array);
            System.out.println(min);
        }
    }

}