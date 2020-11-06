
abstract class Vacation {
	protected int budget;
	protected String destination;
	
	public String toString() {
		return "Budget: " + budget + "\nDestination: " + destination 
				+ "\nClass Name: " + this.getClass().getSimpleName();
	}
	
	public String KeptToBudget(int cost) {
		String s;
		int num = (budget - cost);
		if (num >= 0)
			s = "The vacation is $" + num + " under budget.";
		else
			s = "The vacation is $" + num + " over budget.";
		return s;
	}
}
