package com.company.Programmers.Level0.Day2;

class 수조작하기1 {
    public int solution(int n, String control) {
        char test;
        String w = "w";
        String s = "s";
        String d = "d";
        String a = "a";

        for(int i = 0; i<control.length(); i++) {
            test = control.charAt(i);
            String indexControl = Character.toString(test);
            if(indexControl.equals(w)) {
                n += 1;
            }
            else if(indexControl.equals(s)) {
                n -= 1;
            }
            else if(indexControl.equals(d)) {
                n += 10;
            }
            else if(indexControl.equals(a)) {
                n -= 10;
            }
        }
        return n;



    }
}