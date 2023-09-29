package com.company.Day57;

public class 다음에올숫자 {

    public static void main(String[] args) {

        int common[] = {1, 2, 4};
        삼각형의완성조건 sol = new 삼각형의완성조건();
        sol.solution(common);
    }

    public int solution(int[] common) {
        int result = 0;
        System.out.println(common.length);
        if (common[common.length - 1] - common[common.length - 2] == common[common.length - 2] - common[common.length - 3]) {
            int dif = common[common.length - 1] - common[common.length - 2];
            result = common[common.length - 1] + dif;
            System.out.println("등차");
        } else {

//           if (common[common.length - 1] / common[common.length - 2] == common[common.length - 2] - common[common.length - 3]
            int multiply = common[common.length - 1] / common[common.length - 2];
            result = common[common.length - 1] * multiply;
            System.out.println("등비");
        }
        return result;
    }
}
