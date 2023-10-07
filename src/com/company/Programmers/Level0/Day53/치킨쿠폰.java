package com.company.Programmers.Level0.Day53;

import com.company.Programmers.Level0.Day39.Solution;

class 치킨쿠폰 {

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(1081);
    }

    public int solution(int chicken) {
        int result = 0;
        int coupon = chicken;
        int serviceChickenSum = 0;

        while (coupon >= 10) {
            serviceChickenSum = coupon / 10;
            coupon = coupon % 10 + serviceChickenSum;
            result += serviceChickenSum;
            System.out.println(result);
        }
        return serviceChickenSum;
    }
}