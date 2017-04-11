package stringManipulation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < num; i++) arr[i] = scn.nextInt();
        int times = 0; int sum, length = 1;
        while (length < arr.length){
            for(int i = 0; i < arr.length-length; i++){
              sum = 0;
              for(int j = 0; j < length; j++){
                sum += arr[i + j];
              }
              if(sum < 0){
                times++;      
              }
            }
            length++;
        }
        System.out.println(times);
    }
}