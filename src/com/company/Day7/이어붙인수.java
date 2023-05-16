package com.company.Day7;

import java.util.ArrayList;
import java.util.List;

public class 이어붙인수 {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 1};
        solution(a);
    }

    public static int solution(int[] num_list) {
        int result = 0;
        List<Integer> array = new ArrayList();
        List<Integer> array2 = new ArrayList();
        for(int i = 0; i<num_list.length; i++) {

            if(num_list[i] % 2 ==0) {
                array.add(num_list[i]);

            } else {
                array2.add(num_list[i]);
            }
        }
        String str = "";
        String str2 = "";
        for(Integer k : array) {
            str += k;
        }

        for(Integer u : array2) {
            str2 += u;
        }
        result = Integer.parseInt(str) + Integer.parseInt(str2);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(result);
        return result;
    }
}
