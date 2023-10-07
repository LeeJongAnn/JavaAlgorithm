package com.company.Programmers.Level0.Day20;

public class 숫자찾기 {
    public int solution(int num , int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}

