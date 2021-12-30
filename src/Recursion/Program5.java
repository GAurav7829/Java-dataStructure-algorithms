package Recursion;

public class Program5 {
	public static void main(String[] args) {
		int result = gcd(8, 12);
		System.out.println("greatest common divisor for 8 and 12 is " + result);
	}

	// GCD - greatest common divisor
	public static int gcd(int num1, int num2) {
		if (num1 < 0 || num2 < 0) {
			return -1;
		}
		if (num2 == 0) {
			return num1;
		}
		return gcd(num2, num1 % num2);
	}
}
