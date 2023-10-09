package com.company.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class 제로 {
    static int result = 0;
    static int sum = 0;

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        while (N-- > 0) {

            int num = Integer.parseInt(bf.readLine());

            if (num == 0) {
                if (!stack.isEmpty()) {

                    Integer pop = stack.pop();
                } else {

                    System.out.println(0);
                }
            } else {

                int push = stack.push(num);
            }
        }
        for(int i = 0 ; i<stack.size(); i++) {
            result += stack.get(i);
        }
        System.out.println(result);
    }

}