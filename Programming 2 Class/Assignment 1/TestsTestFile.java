import java.util.Scanner;
public class TestsTestFile {
		public static void main(String[] args) {
			double [] scores = new double[5];
			double classAvg = 0;
			Tests[] t = new Tests[10];
			String first;
			String last;
			Scanner scan = new Scanner(System.in);
			
			for(int i = 0; i < 10; i++) {
				System.out.println("Please enter student " + (i+1) + "'s first name, last name and test scores:");
				first = scan.next();
				last = scan.next();
				for(int j = 0; j < 5; j++) {
					scores[j] = scan.nextDouble();
				}
			t[i] = new Tests(first, last, scores);
		}		
		System.out.println("First Name:\tLast Name:\tTest 1:\tTest 2:\tTest 3:\tTest 4:\tTest 5:\tAverage:\tLetter Grade:");
		for(int i = 0; i < 10; i++) {
			System.out.println(t[i].toString());
		}
	}
}
