package stringManipulation;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int length = A.length() + B.length();
        String Alph = Alph(A , B) ? "Yes" : "No";
        String cap = Capitalize(A,B);
        
        System.out.println(length);
        System.out.println(Alph);
        System.out.println(cap);
    }
    
    public static Boolean Alph(String A, String B){
        if(A.compareTo(B) > 0){
        	return true;
        }
        return false;
    }
    
    public static String Capitalize(String A, String B){
		return ("" + Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}


