package com.company.Programmers.Level0.Day10;

public class 두수의연산값비교하기 {

    public int solution(int a, int b) {

        String result = "";
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        result = strA + strB;

        int returnInt = Integer.parseInt(result);
        int anotherInt = 0;
        if(returnInt < 2 * a * b) {
            anotherInt = 2 * a * b;
            return anotherInt;
        } else {
            return returnInt;
        }
    }
}

