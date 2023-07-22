package com.company.Day32;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class 합성수찾기 {

    public static void main(String[] args) throws IOException {
        solution(10);
    }

    public static int solution(int n) {
        List<Integer> array = new ArrayList<>();
        List<Integer> synthesis = new ArrayList<>();
        List<Integer> countResult = new ArrayList<>();
        int integer = 0;

        for (int i = 1; i <= n; i++) {
            array.add(i);
        }
        for (int j = 0; j < array.size(); j++) {
            integer = array.get(j);
            int count = 0;
            for (int z = 1; z <= integer; z++) {
                if (integer % z == 0) {
                    synthesis.add(z);
                    System.out.print(integer + "의 약수 : " + z + " ");
                    count++;
                    System.out.println("약수의 개수 : " + count);
                    if (count >= 3) {
                        countResult.add(integer);
                    }
                }
            }
            System.out.println();
        }
        List<Integer> collect = countResult.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        int size = collect.size();
        return size;
    }
}