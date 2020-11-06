
import java.util.Scanner;

public class test  {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter your all inclusive vacation's budget:");
		int b = scan.nextInt();
		System.out.println("Enter the destination of your all inclusive vacation:");
		String d = scan.next();
		System.out.println("What brand is your all inclusive vacation:");
		String b1 = scan.next();
		System.out.println("Enter the rating of your all inclusive vacation:");
		int r = scan.nextInt();
		System.out.println("Enter the price of your all inclusive vacation: ");
		int p = scan.nextInt();
		
		AllInclusiveVacation a = new AllInclusiveVacation(b1,r,p,b,d);
		System.out.println(a.toString());
		System.out.println(a.KeptToBudget());
		
		String [] i = new String [3];
		int [] c = new int [3];
		
		System.out.println("Enter your budget for your piecemeal vacation: ");
		int b2 = scan.nextInt();
		System.out.println("Enter the destination of your piecemeal vacation: ");
		String d1 = scan.next();
		System.out.println("Enter the items that you'll do on your piecemeal vacation: ");
		i[0] = scan.next();
		System.out.println("Enter the cost of this item: ");
		c[0] = scan.nextInt();
		
		System.out.println("Have you finished entering all items? (Y/N)");
		String cond = scan.next();
		if(cond.contentEquals("Y")) {
			PiecemealVacation p1 = new PiecemealVacation(i, c, b2, d1);
			System.out.println(p1.toString());
			System.out.println(p1.KeptToBudget());
		}
		else
			System.out.println("Please enter Piecemeal Vacation's items: ");
		i[1] = scan.next();
		System.out.println("Please enter the cost of this item: ");
		c[1] = scan.nextInt();
		
		System.out.println("Have you finished entering all items? (Y/N)");
		String cond1 = scan.next();
		if(cond1.contentEquals("Y")) {
			PiecemealVacation p1 = new PiecemealVacation(i, c, b2, d1);
			System.out.println(p1.toString());
			System.out.println(p1.KeptToBudget());
		}
		else
			System.out.println("Please enter Piecemeal Vacation's items: ");
		i[2] = scan.next();
		System.out.println("Please enter the cost of this item: ");
		c[2] = scan.nextInt();
		
		System.out.println("Have you finished entering all items? (Y/N)");
		String cond2 = scan.next();
		if(cond2.contentEquals("Y")) {
			PiecemealVacation p1 = new PiecemealVacation(i, c, b2, d1);
			System.out.println(p1.toString());
			System.out.println(p1.KeptToBudget());
		}
		else;
	}
}
