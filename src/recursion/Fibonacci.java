package recursion;

public class Fibonacci {

	public int head(int n) {
		
		//F(0)=0 and F(1)=1
		if(n==0) return 0;
		if(n==1) return 1;
		
		int fib1 = head(n-1);
		int fib2 = head(n-2);
		int result = fib1 + fib2;
		
		return result;
	}
	
	public int tail(int n, int accum1, int accum2) {
		
		if(n==0) return accum1;
		if(n==1) return accum2;
		
		return tail(n-1, accum2, accum1+accum2);
	}
}
