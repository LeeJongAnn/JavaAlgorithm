package com.company.Programmers.Level0.Day18;

public class 첫_번째로_나오는_음수 {

    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        solution(num_list);
    }

    public static int solution(int[] num_list) {
        int index = 0;
        int minu = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                index = i;
                break;
            } else if (num_list[i] > 0) {
                index = -1;
            }
        }
        System.out.println(index);
        return index;
    }
}

