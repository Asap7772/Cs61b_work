package javaFeatures;

import java.io.*;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		for (int i = 0; i < N; i++) {
			int c = scn.nextInt();
			switch (c) {
			case 1:
				stack.push(scn.nextInt());
				break;
			case 2:
				stack.pop();
			case 3:
				System.out.println(stack.pop());
			}
		}
		scn.close();
	}
}