package com.company.baekjoon.bronze;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class 단어뒤집기{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int number = Integer.parseInt(bf.readLine());

        for (int i = 0; i < number; i++) {
            String str = bf.readLine();
            Stack<Character> s = new Stack<Character>();

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) != ' ') {
                    s.push(str.charAt(j));
                } else {
                    while (!s.empty()) {
                        sb.append(s.pop());
                    }
                    sb.append(" ");
                }
            }
            while (!s.empty()) {
                sb.append(s.pop());
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

}