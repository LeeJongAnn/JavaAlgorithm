package com.company.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
	static String result = "";

	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String string = "";
		while ((string = bf.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			int sum = 0;

			String[] split = string.trim().split("");

			for (String str : split) {
				if (str.equals("(")) {
					sum += 1;
				} else if (str.equals(")")) {
					sum -= 1;
					if (sum < 0) {
						break;
					}
				}
			}
			if (sum != 0) {
				sb.append("NO");
			} else if (sum == 0) {
				sb.append("YES");
			}
			System.out.println(sb);
		}
	}
}