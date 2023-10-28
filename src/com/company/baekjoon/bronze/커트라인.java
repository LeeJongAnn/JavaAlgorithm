package com.company.baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 커트라인 {

    static int average = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        for(int i = 0 ; i<num1; i++){
            int score = Integer.parseInt(st.nextToken());
            array.add(score);
            Collections.sort(array,Comparator.reverseOrder());
        }

        int result = array.get(num2-1);
        System.out.println(result);
    }

}