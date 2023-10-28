package com.company.baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class 수정렬하기 {


    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        List<Integer> array = new ArrayList<>();

        for(int i = 0; i<num; i++){
            int result = Integer.parseInt(bf.readLine());
            array.add(result);
        }
        Collections.sort(array);
        for (int j = 0; j < num; j++) {
            System.out.println(array.get(j));
        }
    }

}