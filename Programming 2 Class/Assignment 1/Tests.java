import java.util.Scanner;
public class Tests {
	public String firstName;
	public String lastName;
	public int[] scores;
	public int avg;
	public String letterG;
	
	Tests(){
		
	}
	Tests(int[][] s){
		
	}
	public void setFirstName(String f){
		firstName = f;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String l) {
		lastName = l;
	}
	public String getLastName() {
		return lastName;
	}
	public void setScores(int[] s) {
		scores = s;
	}
	public int[] getScores(){
		return scores;
	}
	public void setAverage(int a) {
		avg = a;
	}
	public int getAverage() {
		return avg;
	}
	public void setLetterGrade(String lg) {
		letterG = lg;
	}
	public String getLetterGrade() {
		return letterG;
	}
	public int average(int[] arr) {
		avg=0;
		for(int i = 0;i < arr.length;i++) {
			avg+=i;
		}
		return (avg/5);
	}
	public String letterGrade(int avg) {
		letterG = "";
		if(avg < 100 && avg > 89) {
			letterG = "A";
		}
		else if(avg < 90 && avg > 79) {
			letterG = "B";
		}
		else if(avg < 80 && avg > 69) {
			letterG = "C";
		}
		else if(avg < 70 && avg > 59) {
			letterG = "D";
		}
		else if(avg < 60 && avg > 0) {
			letterG = "F";
		}
		return letterG;
	}
	public String toString() {
		return firstName + " " + lastName + " " + scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + scores[4] + " " + avg + " " + letterG;
	}
	public static void main(String[] args) {
		Tests s1 = new Tests();
	}
	
}
