package com.company.Programmers.Level0.Day10;

class 세균증식{
    public int solution(int n, int t) {
        int sum = 0;
        int temp = n;
        for(int i = 0; i<t; i++){
            temp *=2;
        }
        return temp;
    }
}

