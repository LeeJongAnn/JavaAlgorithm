package com.company.Programmers.Level0.Day44;


import com.company.Programmers.Level0.Day39.Solution;

import java.util.ArrayList;
import java.util.List;

class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 7, 3, 3, 0, 1, 1};
        Solution sol = new Solution();
        sol.solution(a);
    }

    public int[] solution(int[] arr) {
        List<Integer> array = new ArrayList<Integer>();
        array.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                array.add(arr[i]);
            }
        }
        int[] array2 = array.stream().mapToInt(i -> i).toArray();
        System.out.println(array2);
        return array2;
    }
}