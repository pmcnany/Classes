class Student extends Person{
	public String hsclass;
	Student(String n, String a, String pn, String e, String hsc) {
		super(n, a, pn, e);
		this.hsclass = hsc;
	}
	public String toString() {
		return super.toString() + "\n" +
				"High School Class: " + hsclass;
	}
}