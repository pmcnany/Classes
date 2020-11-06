class Staff extends Employee{
	public String title;
	Staff(String n, String a, String pn, String e, String o, int s, int y, int m, int d, String t) {
		super(n, a, pn, e, o, s, y, m, d);
		this.title = t;
	}
	public String toString() {
		return super.toString() + "\n" +
				"Title: " + title;
	}
}	

