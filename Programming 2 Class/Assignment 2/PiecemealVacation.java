
public class PiecemealVacation extends Vacation {
	public String [] items;
	public int [] cost;
	
	public PiecemealVacation(String [] i, int [] c, int b, String d) {
		items = i;
		cost = c;
		budget = b;
		destination = d;
	}
	
	public String toString() {
		String s = "";
		String s2 = "";
		for(int i = 0; i < items.length; i++) {
			s += items[i] + ", ";
		}
		for(int i = 0; i < cost.length; i++) {
			s2 += cost[i] + ", ";
		}
		return super.toString() + "\nItems bought: " + s + "\nCost of Items: " + s2;
	}
	
	public String KeptToBudget() {
		int totalC = 0;
		for(int i = 0; i < cost.length; i++) {
			totalC += cost[i];
		}
		return super.KeptToBudget(totalC);
	}
	

}
