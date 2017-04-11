package loopingFun;

public class LoopingProj {

	public static void main(String[] args) {
		System.out.println(binary(45));
		fibonacci(7);
		LoopingProj.pyramid(4);
	}

	//to fix
	public static String binary(int n){
		int x = 1;
		int power = -1;
		while(x < n){
			x*=2;
			power++;
		}
		x/=2;
		String binary = "1";
		n -= x;
		x/=2;
		for(int i = power-1; i >= 0; i--){
			if(n>x){
				binary = binary.concat("1");
				n = n-x;
			}else{
				binary = binary.concat("0");
			}
			x = x/2;
		}
		return binary;
	}

	public static int countDigits(int n){
		return Integer.toString(n).length();
	}

	public static int[] coinTrials(int N){
		int head = 0;
		int tail = 0;
		for(int i = 0; i< N; i++){
			switch((int)(Math.random()*2)){
			case 1:
				head++;
				break;
			default:
				tail++;
				break;
			}
		}
		return new int[]{head,tail};
	}


	public static int factorial(int n){
		if(n == 0){
			return 1;
		}
		return n * factorial(n-1);
	}

	public static void fibonacci(int n){
		int n1 = 1;
		int n2 = 1;

		if(n == 1){
			System.out.println(1);
		}else if(n>1){
			System.out.print(1 + ", " + 1);
		}

		for(int i = 0; i< n-2; i++){
			int x = sum(n1, n2);
			System.out.print(", " + x);
			n1 = n2;
			n2 = x;
		}
		System.out.println(".");
	}

	//euclidean algorithm
	public static int gcf(int x, int y){
		int large = Math.max(x, y);
		int small = Math.min(x, y);
		if(large % small == 0){
			return small;
		}else{
			return gcf(small, large%small);
		}
	}

	public static boolean isEven(int n){
		return n%2==0;
	}

	public static boolean isPerfect(int n){
		int sum = 1;
		for(int i = 2; i<= n; i++){
			if(isFactor(n,i)){
				sum += i;
			}
		}
		return sum == n;
	}

	public static boolean isPrime(int n){
		for(int i = 0; i<= Math.sqrt(n); i++){
			if(isFactor(n, i)) return false;
		}
		return true;
	}

	public static int lcm(int x, int y){
		return product(x,y)/gcf(x,y);
	}
	public static void primeFactorization(int x){
		int i = 2;
		int prevFactor = -1;
		int count = 0;
		if(isPrime(x)){
			System.out.println(x + " is prime and has no factors. It's prime factorization is " + x + ".");
		}else{
			while(x!= 1){
				if(isFactor(x, i)){
					if(prevFactor == i){
						count ++;
						x/=i;
					}
					else{
						if(prevFactor != -1){
							System.out.print(prevFactor + " ^ " + count +  " x ");
						}
						prevFactor = i;
						count = 1; 
						x/=i;
					}
				}else{
					i++;
				}
			}
			if(prevFactor != -1) System.out.print(prevFactor + " ^ " + count +  ".");
		}
	}

	public static void primeNumberList(int n){
		for(int i = 2; i< n; i++){
			if(isPrime(i)) System.out.println(i);
		}
	}

	public static void printFactors(int n){
		boolean first = true;
		for(int i = 1; i<= n; i++){
			if(isFactor(n, i)){
				if(!first){
					System.out.print(", " + i);
				}else{
					System.out.println(i);
				}
			}
		}
		System.out.println(".");
	}

	public static int reverseNumber(int n){
		String str = n + "";
		String str2 = "";
		for(int i = str.length()-1; i >= 0 ; i--){
			str2 = str2.concat(str.substring(i, i+1));
		}
		return Integer.parseInt(str2);
	}

	public static int sumDigits(int n){
		String str = n + "";
		int sum = 0;
		for(int i = str.length()-1; i >= 0 ; i--){
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		return sum;
	}

	//Mathematical
	public static int sumIntsMath(int n){
		return(n*n-1)/2;
	}

	//Recursive
	public static int sumIntsRec(int n){
		if(n == 0){
			return 0;
		}
		return n + sumIntsRec(n-1);
	}
	 

	public static void pyramid(int n){
		for(int i = 0; i< n; i++){
			for(int j = 0; j <= (n-i); j++){
				System.out.print("  ");
			}for(int j = 0; j <= 2*i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	//helper methods
	public static boolean isFactor(int x, int y){
		if(y <= 0) return false; // only positive numbers
		return x%y == 0;
	}

	public static int sum(int x, int y){
		return x+y;
	}

	public static int product(int x, int y){
		return x*y;
	}

}
