package com.company.Day4;

class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int i = 0; i<array.length; i++) {
            if(array[i]>height) {
                count+=1;
            }
        }
        return count;
    }
}