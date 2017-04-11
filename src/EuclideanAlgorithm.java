import java.util.Scanner;

public class EuclideanAlgorithm {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		int x = scn.nextInt();
		System.out.print("Enter the Second Number: ");
		int y = scn.nextInt();
		System.out.println("The GCF is " + gcf(x,y));
		System.out.println("The GCF is " + rgcf(x,y));
		scn.close();
	}
	
	public static int gcf(int x, int y){
		while(x%y != 0){
			int t = x;
			x = y;
			y = t % y;
		}
		return y;
	}
	
	public static int rgcf(int x, int y){
		if(x%y != 0){
			return rgcf(y, x%y);
		}
		return y;
	}
}
