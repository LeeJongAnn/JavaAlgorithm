package com.company.Day3;

import java.util.ArrayList;
import java.util.List;

public class 배열원소의길이 {
    public static void main(String[] args) {

        String strlist[] = { "We", "are", "the", "world!" };
        solution(strlist);

    }

    public static List<Integer> solution(String[] strlist) {
        List<Integer> array = new ArrayList<Integer>();



        for (String args : strlist) {
            int count = 0;
            for(int i = 0; i<args.length(); i++) {
                count += 1;

            }
            array.add(count);
        }
        System.out.println(array);
        return array;
    }
}
