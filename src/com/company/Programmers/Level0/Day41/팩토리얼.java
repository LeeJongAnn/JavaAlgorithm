package com.company.Programmers.Level0.Day41;

class Solution2 {

    public static void main(String[] args) {
        Solution2 so = new Solution2();

        so.solution(24);
    }

    public int solution(int k) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            int factorial = factorial(i);
            if (factorial == k) {
                System.out.println("값이 같습니다.");
                result = i;
            } else if(factorial < k){
                result = i;
            }
        }
        return result;
    }

    public static int factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
