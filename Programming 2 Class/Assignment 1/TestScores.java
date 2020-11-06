import java.util.Scanner;
public class TestScores {
	String firstName;
	String lastName;
	double [] grades;
	char letter;
	
	//constructor
	public TestScores(String fn, String ln, double [] g) {
		firstName = fn;
		lastName = ln;
		for(int i = 0; i < g.length; i++) {
			grades[i] = g[i];
		}
	}
	
	//setter and getter methods
	public char getLetterGrade() {
		return letter;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double[] getGrades() {
		return grades;
	}
	public void setGrades(double [] g1) {
		grades = g1;
	}
	public void setFirstName(String fn1) {
		firstName = fn1;
	}
	public void setLetterGrade(char l) {
		letter = l;
	}
	
	public double getAverage(double [] g2) {
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += grades[i];
		}
		double avg = sum/5;
		return avg;
	}
	
	public char getLetter(double avg) {
		if(avg >= 90.0)
			letter = 'A';
		else if(avg >= 80.0 && avg < 90.0)
			letter = 'B';
		else if(avg >= 70.0 && avg < 80.0)
			letter = 'C';
		else if(avg >= 60.0 && avg <70.0)
			letter = 'D';
		else letter = 'F';
		return letter;
	}
	
	//override toString method
	public String toString() {
		double avg = getAverage(grades);
		String s = firstName + " " + lastName + " " + grades[0] + " " +
				grades[1] + " " + grades[2] + " " + grades[3] + " " + grades[4] + " " + avg + " " + getLetter(avg);
		return s;
	}

}

