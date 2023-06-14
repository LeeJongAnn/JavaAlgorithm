package com.company.Day22;

public class 인덱스바꾸기 {
    public int solution(int num , int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1;
    }
}

