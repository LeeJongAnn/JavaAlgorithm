package com.company.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 수정렬하기3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int array[] = new int[num1];

        for(int i = 0 ; i<num1; i++){
            int i1 = Integer.parseInt(bf.readLine());
            int score = i1;
            array[i] = score;
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++)
        {
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
    }

}