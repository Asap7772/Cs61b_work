
public class MathPrblm {
	public static int function(int n){
		if(n>=1000){
			System.out.println(n);
			return n-3;
		}
		else{
			System.out.println(n);
			return function(function(n+5));
		}
	}
	//recursive
	public static boolean isPalindrome(String str){
		if(str.equals("") || str.length() == 1) return true;
		if(str.charAt(0) == str.charAt(str.length()-1) && MathPrblm.isPalindrome(str.substring(1,str.length()-1))) return true;
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(function(84));
		System.out.println(MathPrblm.isPalindrome("1234432"));
	}
}
