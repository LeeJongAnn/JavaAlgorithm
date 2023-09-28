package com.company.Day56;

public class 연속된수의합 {

    public static void main(String[] args) {
        int n = 5;
        int m = 15;
        Solution sol = new Solution();
        sol.solution(n,m);
    }

    public int[] solution(int num , int total) {

        int first = total / num ;
        int array [] = new int[num];

        int m = (( total * 2 / num ) + num -1 ) / 2;

        for (int i = 0; i < num; i++) {
            array[num-1-i] = m-i;
        }
        return array;
    }
}
