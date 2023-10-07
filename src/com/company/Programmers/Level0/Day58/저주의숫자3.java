package com.company.Programmers.Level0.Day58;


class 저주의숫자3 {


    public static void main(String[] args) {
        int n = 15;
        Solution sol = new Solution();
        sol.solution(n);

    }

    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count ++;
            while(count % 3 == 0 || String.valueOf(count).contains("3")){
                count += 1;
            }
//            if (count % 3 == 0 || String.valueOf(count).contains("3")) {
//                count ++;
//            }
        }
        System.out.println(count);
        return count;
    }
}