package recursion;

public class App {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.head(5));
		System.out.println(f.tail(5, 1));
		
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.head(5));
		System.out.println(fib.tail(5, 0, 1));
		
		TowersOfHanoi towers = new TowersOfHanoi();
		towers.solve(2, 'A', 'B', 'C');
		
		GCD gcd = new GCD();
		System.out.println(gcd.gcdRecursion(24, 9));
	}
}
