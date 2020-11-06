
public class AllInclusiveVacation extends Vacation {
	public String brand;
	public int rating;
	public int price;
	
	public AllInclusiveVacation(String b, int r, int p, int b2, String d) {
		brand = b;
		rating = r;
		price = p;
		budget = b2;
		destination = d;
	}
	
	public String toString() {
		return super.toString() + "\nBrand: " + brand + "\nRating: " 
			 + rating + "\nPrice: " + price;
		
	
	}
	
	public String KeptToBudget() {
		return super.KeptToBudget(price);
	}

}