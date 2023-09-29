package com.company.Day57;

import java.util.Arrays;

class 삼각형의완성조건 {

    public static void main(String[] args) {

        int[] array = {11, 7};
        삼각형의완성조건 sol = new 삼각형의완성조건();
        sol.solution(array);

    }

    public int solution(int[] sides) {
        int sideSum = 0;
        int count = 0;
        Arrays.sort(sides);
        for (int i = 0; i < sides.length; i++) {
            sideSum += sides[i];
        }
        System.out.println(Arrays.toString(sides));

        // 다른 변이 가장 긴 변인 경우
        for (int i = sides[sides.length - 1]; i < sideSum; i++) {
            count += 1;
//            System.out.print(i + " ");
        }

        // 주어진 변에서 가장 긴 변이 존재하는 경우
        for (int i = 0; i < sides[sides.length - 1]; i++) {
            if (sides[0] + i > sides[sides.length - 1]) {
                count += 1;
//                System.out.print(i + " ");
            }

        }

        System.out.println(count);
        return count;
    }
}