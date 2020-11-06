import java.util.Scanner;
public class factorial {
	public static int compute(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return n * compute(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to calculate the factorial of: ");
		int num = scan.nextInt();
		System.out.println("The factorial of " + num + " is " + compute(num));
	}
}


