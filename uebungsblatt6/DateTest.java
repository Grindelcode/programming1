package prog1.uebungsblatt6;

public class DateTest {

	public static void main(String[] args) {
		
		Date  testDate;
		
		String sMonth = "März";
		
		int day = 24;
		String month = "12";
		int year = 2018;
		
		testDate = new Date(month, day, year);
		System.out.println(testDate.toString());
		
		testDate = new Date(month, year);
		System.out.println(testDate.toString());
		
		testDate = new Date(sMonth, day, year);
		System.out.println(testDate.toString());
		
	}

}
