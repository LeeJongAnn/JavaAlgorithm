package com.company.Day34;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 없는숫자더하기 {

    static int sum = 0;

    public static void main(String[] args) {
        int[] answer = { 1, 2, 3, 4, 6, 7, 8, 0 };
        solution(answer);
    }

    public static int solution(int[] numbers) {

        List<Integer> collect = Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
        for (int i = 0; i < 10; i++) {
            if (collect.contains(i)) {
                System.out.print(i + " : SUCCESS ");
            } else {
                System.out.println(i + " : It'doesn't have ");
                sum += i;
            }
        }
        System.out.println(collect);
        return sum;
    }
}