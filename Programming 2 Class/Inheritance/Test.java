
public class Test {
	public static void main(String [] args) {
		Person p = new Person("Guy Fieri", "123 Flavor Path, Flavor Town", "234-567-6769", "guyf@flavortown.gov");
		Student s = new Student("Peter Parker", "342 Empire Blvd., Queens", "515-432-6543", "notspiderman@dailybugle.com", "Sophomore");
		Employee e = new Employee("Homer Simpson", "742 Evergreen Terrace, Springfield", "555-555-5556", "hsimp@mapple.com", "N-221", 40000, 1989, 12, 24);
		Faculty f = new Faculty("Jimmy Dean", "1 Breakfast Sandwich Pkwy., Flavor Town", "123-123-1234", "jdean@jdean.gov", "JD-101", 300000000, 1969, 1, 1, 168, "Commander and Chief");
		Staff s1 = new Staff("Jeff Chastine", "1100 South Marietta Pkwy SE, Marietta, GA 30060", "470-578-6000", "jchastine@staff.kennesaw.edu", "J-300", 10, 2015, 6, 23, "Chief");
		System.out.println(p.toString());
		System.out.println();
		System.out.println(s.toString());
		System.out.println();
		System.out.println(e.toString());
		System.out.println();
		System.out.println(f.toString());
		System.out.println();
		System.out.println(s1.toString());
	}
}