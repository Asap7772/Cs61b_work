package stringManipulation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayManip{

    public static ArrayList<Integer> arrL = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
       
        for(int i = 0; i < test; i++){
            
            int num  = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = new int[num];
            
            for(int j = 0; j < num; j++){
                arr[j] = scn.nextInt();
            }
            
            String str = canWin(arr, 0, m) ? "YES" : "NO";
            System.out.println(str);
        }
        
    }
    
    public static boolean canWin(int[] arr, int index, int m){
        if(arrL.contains(index)){
            return false;
        }else{
            arrL.add(index);
            
            if(index > arr.length-1){
                return true;
            }
            
            else if(index < 0){
                return false;
            }
            
            else if(arr[index] != 0){
                return false;
            }
            
            else if(canWin(arr, index + 1, m) && !arrL.contains(index+1)){
                return true;
            }
            
            else if(canWin(arr, index - 1, m) && !arrL.contains(index-1)){
                return true;
            }
            
            else if(canWin(arr, index + m, m) && !arrL.contains(index+m)){
                return true;
            }
            
            else{
                return false;
            }
            
        }
        
    }
    
}
