package com.company.Day45;


import com.company.Day39.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class 등수매기기 {
    public static void main(String[] args) {

        int[][] score = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
        Solution sol = new Solution();
        sol.solution(score);
    }

    public int[] solution(int[][] score) {
        List<Integer> array = new ArrayList<>();
        List<Integer> copyArray = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            array.add(score[i][0] + score[i][1]);
        }
        int[] result = new int[score.length];
        copyArray.addAll(array);
        Collections.sort(copyArray, Comparator.reverseOrder());
        for (int i = 0; i < array.size(); i++) {
            result[i] = copyArray.indexOf(score[i][0] + score[i][1]);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] += 1;
        }
        return result;
    }
}