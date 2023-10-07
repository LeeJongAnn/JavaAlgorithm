package com.company.Programmers.Level0.Day39;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 숨어있는숫자의덧셈 {


    public static int sum = 0;

    public static void main(String[] args) {
        String s = "aAb1B2cC34oOp";
        solution(s);
    }

    public static int solution(String my_string) {

        List<String> collect = Arrays.stream(my_string.split("[a-zA-Z]")).collect(Collectors.toList());
        System.out.println(collect);

        for(String list : collect){
            if(list.isBlank()){
                System.out.println("BLANK");
            } else {
                int i = Integer.parseInt(list);
                System.out.println(i);
                sum += i;
            }
        }
        return  sum;
    }


}
