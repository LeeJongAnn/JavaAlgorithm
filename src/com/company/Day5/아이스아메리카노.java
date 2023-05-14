package com.company.Day5;

import java.util.ArrayList;
import java.util.List;

public class 아이스아메리카노 {
    public List<Integer> solution(int money) {
        int iceAmericano = 5500;
        int result = money / iceAmericano;
        int other = money % iceAmericano;
        List<Integer> array = new ArrayList<Integer>();

        array.add(result);
        array.add(other);

        return array;
    }
}
