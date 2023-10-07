package com.company.Programmers.Level0.Day38;

import java.util.*;
import java.util.stream.Collectors;

public class 모스부호 {


    public static void main(String[] args) {

        String s = ".... . .-.. .-.. ---";
        solution(s);
    }
    public static String solution(String letter) {
        String [] morse = {".-","-...","-.-.","-..",".","..-."
                ,"--.","....","..",".---","-.-",".-..","--","-."
                ,"---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        List<String> collect = Arrays.stream(alphabet.split("")).collect(Collectors.toList());
        System.out.println(collect);
        HashMap<String,String> hashMap = new HashMap<>();
        List<String> morseCollector = Arrays.stream(morse).collect(Collectors.toList());

        for(int i = 0; i<morseCollector.size(); i++){
            hashMap.put(morseCollector.get(i),collect.get(i));
        }
        List<String> letterSplit = Arrays.stream(letter.split(" ")).collect(Collectors.toList());

        String str = "";
        System.out.println(hashMap.get(".-"));
        for(String list : letterSplit){
            String s = hashMap.get(list);
            str += s ;
        }

        return str;

    }

}
