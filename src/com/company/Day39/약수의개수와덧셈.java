package com.company.Day39;

import java.util.ArrayList;
import java.util.List;

class 약수의개수와덧셈 {
    public static int sum = 0;

    public static void main(String[] args) {

        int a = 13;
        int b = 17;

        solution(a,b);
    }

    public static int solution(int left, int right) {
        List<Integer> array = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int count = 0;
            for(int j = 1; j<=i; j++){

                if(i % j == 0){
                    count +=1 ;
                    array.add(j);
                }
            }
            if(count % 2 == 0){
                sum += i;
            } else {
                sum -= i;
            }
            System.out.println("약수의 개수 : " + count);

        }
        System.out.println("약수의 합 : " + sum);
        System.out.println(array);
        return sum;
    }
}
