package com.company.Day24;

import java.util.Stack;

public class 배열회전시키기 {
    public static void main(String[] args) {
        int[] array = {4, 455, 6, 4, -1, 45, 6};
        solution(array, "right");
    }

    public static Stack<Integer> solution(int[] numbers, String direction) {
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer list : numbers) {
            stack.add(list);
        }
        String right = "right";
        System.out.println(stack);
        if(direction.equals(right)) {
            stack.add(0, numbers[numbers.length-1]);
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);

        } else {
            stack.add(numbers.length, numbers[0]);
            stack.remove(0);
            System.out.println(stack);
        }

        return stack;
    }
}

