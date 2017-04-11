package javaFeatures;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Add {
	// public int add(int... args) {
	// int[] arr = args.clone();
	// int sum = 0;
	// for (int i = 0; i < arr.length; i++) {
	// sum += arr[i];
	// }
	// return sum;
	// }

	public void add(int... args) {
		int[] arr = args.clone();
		int sum = 0;
		String sumStr = "";
		for (int i = 0; i < arr.length; i++) {
			sumStr = sumStr.concat(arr[i] + "+");
			sum += arr[i];
		}
		sumStr = sumStr.substring(0, sumStr.length()-1).concat("=" + sum);
		System.out.println(sumStr);
	}
}

public class VariableArgs {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			int n6 = Integer.parseInt(br.readLine());
			Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			Method[] methods = Add.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
