package Recursion;

public class Program1 {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("factorial of 5 is " + result);

	}

	public static int factorial(int n) {
		if (n <= -1) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
