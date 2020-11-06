
public class Person {
	public String name;
	public String address;
	public String phoneNumber;
	public String email;
	Person(String n, String a, String pn, String e){
		this.name = n;
		this.address = a;
		this.phoneNumber = pn;
		this.email = e;
	}
	public String toString() {
		return this.getClass().getSimpleName() +": " +  name + "\n" + 
				"Address : " + address + "\n" +
				"Phone Number: " + phoneNumber + "\n" + 
				"Email: " + email;
	}	
}