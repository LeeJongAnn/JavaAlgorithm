package com.company.Day30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class 외계행성의나이 {

    public static void main(String[] args) {

        solution(23);
    }

    public static String solution(int age) {

        String number = "abcdefghij";
        List<String> array = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            char charAt = number.charAt(i);
            String string = Character.toString(charAt);
            array.add(string);
        }
//
        String str = "";
        HashMap<String, Integer> hash = new HashMap<>();
        Integer count = 0;
        for (String list : array) {
            hash.put(list, hash.getOrDefault(list, count));
            count++;
        }
        String valueOf = String.valueOf(age);
        String[] split = valueOf.split("");
        Integer parseInt = 0;
        List<String> IntegerArray = new ArrayList<>();
        for (String str1 : split) {
            parseInt = Integer.parseInt(str1);
            IntegerArray.add(getKey(hash, parseInt));
        }

        String strAnswer = "";

        for (String answer : IntegerArray) {
            strAnswer += answer;
        }
        System.out.println(strAnswer);
        return strAnswer;
    }

    public static <K, V> K getKey(Map<K, V> hashMap, V value) {

        for (K key : hashMap.keySet()) {
            if (value.equals(hashMap.get(key))) {
                return key;
            }
        }
        return null;
    }
}