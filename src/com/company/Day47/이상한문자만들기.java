package com.company.Day47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 이상한문자만들기 {


    public static void main(String[] args) {

        String s = "try hello world ";
        Solution sol = new Solution();
        sol.solution(s);

    }

    public String solution(String s) {

        String[] split = s.split(" ", -1);
        System.out.print(Arrays.toString(split));
        List<String> array = new ArrayList<>();
        String k = "";
        for (String str : split) {
            String[] split1 = str.split("");
            for (int i = 0; i < split1.length; i++) {
                if (i % 2 == 0) {
                    String upperCase = split1[i].toUpperCase();
                    k += upperCase;
                    array.add(upperCase);
                } else if (i % 2 != 0) {
                    String lowerCase = split1[i].toLowerCase();
                    k += lowerCase;
                    array.add(lowerCase);
                }

            }
            k += " ";
        }
        k = k.substring(0, k.length() - 1);
        return k;
    }
}