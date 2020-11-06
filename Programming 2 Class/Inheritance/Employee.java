class Employee extends Person{
	public String office;
	public double salary;
	public int year;
	public int month;
	public int day;
	Employee(String n, String a, String pn, String e, String o, double s, int y, int m, int d){
		super(n, a, pn, e);
		this.office = o;
		this.salary = s;
		this.year = y;
		this.month = m;
		this.day = d;
	}
	public String toString() {
		return super.toString() + "\n" +
				"Office: " + office + "\n" +
				"Salary: " + salary + "\n" +
				"Hired: " + year + "/" + month + "/" + day;
	}
	
}