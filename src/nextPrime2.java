
public class nextPrime2 {
	public static void main(String[] args){
		long x = 2;
		while(true){
			if((Math.pow(2, x-1) % x) == 1){
				System.out.println(x);
			}
			x++;
		}
	}
}
