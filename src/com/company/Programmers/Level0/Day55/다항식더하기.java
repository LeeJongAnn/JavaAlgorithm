package com.company.Programmers.Level0.Day55;

import com.company.Programmers.Level0.Day39.Solution;

class 다항식더하기 {

    static String valueOf = "";
    static int num = 0;
    static int coefficent = 0;
    static String result = "";

    public static void main(String[] args) {

        Solution sol = new Solution();
        String str = "4x + 7";

        sol.solution(str);
    }

    public String solution(String polynomial) {

        String[] split = polynomial.split("\\+");
        for (String str : split) {
            str = str.trim();
            if (str.contains("x")) {
                coefficent += str.equals("x") ? 1 : Integer.parseInt(str.replaceAll("x", ""));
            } else {
                num += Integer.parseInt(str);
            }
        }
//		if(num == 0) {
//			result += coefficent + "x";
//		} else if( coefficent == 0	) {
//			result += num;
//		} else {
//			result += coefficent + "x" + " + " + num;
//		}
        return (coefficent != 0 ? coefficent > 1 ? coefficent + "x" : "x" : "") + (num != 0 ? (coefficent != 0 ? " + " : "") + num : coefficent == 0 ? "0" : "");
    }
}