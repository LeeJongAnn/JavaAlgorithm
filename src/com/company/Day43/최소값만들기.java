package com.company.Day43;

import com.company.Day39.Solution;

import java.util.Collections;
import java.util.PriorityQueue;
import ava.util.stream.Collectors;

class 최소값만들기 {
    public static void main(String[] args) {

        int[] A = { 1, 4, 2 };
        int[] B = { 5, 4, 4 };
        Solution sol = new Solution();
        sol.solution(A, B);

    }

    public int solution(int[] A, int[] B) {
        PriorityQueue<Integer> array = new PriorityQueue<Integer>();
        PriorityQueue<Integer> array2 = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i = 0 ; i<A.length; i++) {
            array.add(A[i]);
            array2.add(B[i]);
        }
        int result = 0;
        while(!array.isEmpty() && !array2.isEmpty()) {
            Integer poll = array.poll();
            Integer poll2 = array2.poll();

            result += poll * poll2;
        }

        System.out.println(result);
        return result;
    }
}