package com.company.Day56;

public class 종이자르기 {
    public static void main(String[] args) {
        int n = 2;
        int m = 2;
        Solution sol = new Solution();
        sol.solution(n,m);
    }

    public int solution(int M, int N) {
        int result = ((M) * (N)) - 1;
        System.out.println(result);
        return result;
    }

}
