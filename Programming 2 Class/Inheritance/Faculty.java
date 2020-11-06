class Faculty extends Employee{
	private int officeHours;
	private String rank;
	Faculty(String n, String a, String pn, String e, String o, double s, int y, int m, int d, int oh, String r) {
		super(n, a, pn, e, o, s, y, m, d);
		this.officeHours = oh;
		this.rank = r;
	}
	public String toString() {
		return super.toString() + "\n" +
				"Office Hours: " + officeHours + "\n" +
				"Rank: " + rank;
	}
	
}