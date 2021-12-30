package Recursion;

public class Program3 {

	public static void main(String[] args) {
		int result = sumOfDigit(123);
		System.out.println("Sum of digit of 123 is " + result);
	}

	public static int sumOfDigit(int n) {
		if (n < 0) {
			return 0;
		}
		if (n % 10 == 0) {
			return n;
		}
		return (n % 10) + sumOfDigit(n / 10);
	}

}
