package com.company.Programmers.Level0.Day48;

import com.company.Programmers.Level0.Day39.Solution;

import java.util.Arrays;

class OX퀴즈 {

    public static void main(String[] args) {

        Solution sol = new Solution();
        String s[] = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
        sol.solution(s);
    }

    public String[] solution(String[] quiz) {

        String[] array = new String[quiz.length];
        int count = 0;
        for (String str : quiz) {
            String[] split = str.split(" ");

            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[2]);
            int num3 = Integer.parseInt(split[4]);

            switch (split[1]) {

                case "+":
                    array[count] = (num1 + num2 == num3) ? "O" : "X";
                    count++;
                    break;
                case "-":
                    array[count] = (num1 - num2 == num3) ? "O" : "X";
                    count++;
                    break;
            }
        }

        System.out.print(Arrays.toString(array));
        return array;
    }
}