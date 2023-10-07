package com.company.Programmers.Level0.Day11;

public class 옷가게할인받기 {

    public int solution(int price) {

        double result = 0;
        if(price >= 100000 && price <300000) {
            result = price - (price * 0.05);
            Math.floor(result);
        } else if(price >= 300000 && price < 500000) {
            result = price - (price * 0.1);
        } else if(price >= 500000) {
            result = price - (price * 0.2);
        } else {
            return price;
        }
        return (int)result;
    }
}

