package prog1.uebungsblatt5;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	private static int count = 0;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		count ++;
		
	}

	public String toString() {
		return "Vorname: " + firstName + "Nachname: " + lastName;
	}

	public static void main(String[] args) {
		Employee empl = new Employee("Alexander", "Lehmann");
		Employee empl2 = new Employee("Max", "Müller");
		Employee empl3 = new Employee("Martin", "Muster");
		
		System.out.println(empl);
		System.out.println(empl2);
		System.out.println(empl3);
		
		System.out.println("Objektanzahl: " + getCount());
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName  = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public static int getCount() {
		return count;
	}



}
