package com.company.Day23;

import java.util.HashMap;

public class 최빈값구하기 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int mode = solution(array);
        System.out.println("최빈값 : " + mode);
    }

    public static int solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = 0;
        int maxCount = 0;

        for (int num : countMap.keySet()) {
            int count = countMap.get(num);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            } else if(count == maxCount) {
                maxCount = count;
                mode = -1;
            }
        }
        return mode;
    }
}

