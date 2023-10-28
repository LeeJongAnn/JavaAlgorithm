package com.company.baekjoon.bronze;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class 배수와약수 {

    static String result = "";

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int s = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            if(s != 0 && s1 != 0) {

                if (s1 % s == 0) {
                    result = "factor";
                    System.out.println(result);
                } else if (s % s1 == 0) {
                    result = "multiple";
                    System.out.println(result);
                } else {
                    result = "neither";
                    System.out.println(result);
                }
            } else {
                break;
            }
        }

    }

}