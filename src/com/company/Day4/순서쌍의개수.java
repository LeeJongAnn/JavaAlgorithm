package com.company.Day4;

import java.util.ArrayList;
import java.util.List;

class 순서쌍의개수 {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        return count;

    }
}