package recursion;

public class GCD {

	public int gcdRecursion(int a, int b) {
		
		if(a % b == 0) return b;
		
		return gcdRecursion(b, a % b);
	}
}
