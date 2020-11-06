import java.util.Scanner;

public class recursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String s = scan.nextLine();
		System.out.println("The number of vowels in the String " + s + " is " + vowelCount(s, s.length()));
	}
	public static int isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U') {
			return 1;
		}
		else
			return 0;
	}

	public static int vowelCount(String s, int n) {
		if(n == 1) {
			return isVowel(s.charAt(n - 1));
			}
		return vowelCount(s, n-1) + isVowel(s.charAt(n-1));
	}
}
