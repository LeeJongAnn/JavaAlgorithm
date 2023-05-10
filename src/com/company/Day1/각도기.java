package com.company.Day1;

class 각도기 {
    public int solution(int angle) {
        int result = 0;
        if (angle < 90) {
            result = 1;
            return 1;
        } else if (angle == 90) {
            result = 2;
            return 2;
        } else if (angle < 180) {
            result = 3;
            return 3;
        } else if (angle == 180) {
            result = 4;
            return 4;
        }
        return result;
    }
}