

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int number = i;

            while (number != 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum + i == N) {
                array.add(i);
            }
        }

        if (array.isEmpty()) {
            System.out.println(0);
        } else {
            Integer min = Collections.min(array);
            System.out.println(min);
        }
    }

}