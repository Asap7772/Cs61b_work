package stringManipulation;

import java.io.*;
import java.util.*;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int length = scn.nextInt();
		String[] arr = sort(collection(str,length));
		System.out.println(arr[0]);
		System.out.println(arr[length-1]);
	}

	public static String[] collection(String str, int length){
		String arr[] = new String[(str.length() -length - 1)]; 
		for(int i = 0; i < (str.length() -length - 1); i++){
			arr[i] = str.substring(i, i + length);
		}
		return arr;
	}

	public static String[] sort(String[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i].compareToIgnoreCase(arr[j]) > 0){
					String str = arr[i];
					arr[i] = arr[j];
					arr[j] = str;
				}
			}
		}
		return arr;
	}
}