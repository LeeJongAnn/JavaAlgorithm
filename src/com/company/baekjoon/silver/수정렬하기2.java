package com.company.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 수정렬하기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> array = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num1 = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i<num1; i++){
            int i1 = Integer.parseInt(bf.readLine());
            int score = i1;
            array.add(score);
        }
        Collections.sort(array);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.size(); i++)
        {
            sb.append(array.get(i)).append("\n");
        }
        System.out.println(sb.toString());
    }

}

