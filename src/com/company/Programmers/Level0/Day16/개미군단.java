package com.company.Programmers.Level0.Day16;

public class 개미군단 {
    public static void main(String[] args) {

        solution(999);
    }

    public static int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp / 1;
        return answer;
    }

//    public static int solution(int hp) {
//        int bigCount = 0;
//        int fighterCount = 0;
//        int smallCount = 0;
//        int remain = 0;
//        int result = 0;
//        int header = 0;
//        int b2;
//        if(hp%5 !=0) {
//            result = hp/5;
//            header = hp%5;
//            bigCount += result;
//            if(header % 3 != 0) {
//                remain = header/3;
//                b2 = header%3;
//                fighterCount += remain;
//                if(header % 3 > 0) {
//                    smallCount += b2;
//                }
//            } else if( header % 3 == 0) {
//                header = header / 3;
//                fighterCount += header;
//            }
//        } if(hp % 5 == 0) {
//            result = hp/5;
//            bigCount += result;
//        }
//        System.out.println(bigCount + fighterCount+smallCount);
//        return bigCount + fighterCount + smallCount;
//    }
}

