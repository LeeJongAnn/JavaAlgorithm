

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int count = 1;
        int number = 666;

        while (count != N) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }

        System.out.println(number);

    }

}