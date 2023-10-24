package com.company.baekjoon.silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 설탕배달 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bf.readLine());
        List<Integer> array = new ArrayList<>();

        for(int i = 0 ; i<2000; i++){
            for(int j = 0; j<3000; j++){
                if(i * 5 + j * 3 == number){
                    int result = i + j;
                    array.add(result);
                }
            }
        }
        if(array.size() == 0){
            System.out.println(-1);
        } else {
            Integer min = Collections.min(array);
            System.out.println(min);
        }
    }
}