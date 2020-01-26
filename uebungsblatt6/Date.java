package prog1.uebungsblatt6;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int month,int day, int year) {
		if(day <= 31 && day >= 1) {
			this.day = day;
		}else {
			this.day = 1;
		}
		
		if(month >= 1 && month <= 31) {
			this.month = month;
		}else {
			this.month = 1;
		}
		
		if(year >= -2000 && year <= 3000) {
			this.year = year;
		}else {
			this.year = 2018;
		}
	}
	
	public Date(String month,int day, int year) {
		
		monthStringToInt(month);
		this.day = day;
		this.year = year;
	}
	
	public Date(String month, int year) {
		this.day = 1;
		this.month = Integer.parseInt(month);
		this.year = year;
	}
	
	public String toString() {
		return "" + day + "." + month + "." + year;
	}

	private void monthStringToInt(String month) {
		
		switch(month) {
		case "Januar":
			this.month = 1;
			break;
		case "Februar":
			this.month = 2;
			break;
		case "März":
			this.month = 3;
			break;
		case "April":
			this.month = 4;
			break;
		case "Mai":
			this.month = 5;
			break;
		case "Juni":
			this.month = 6;
			break;
		case "Juli":
			this.month = 7;
			break;
		case "August":
			this.month = 8;
			break;
		case "September":
			this.month = 9;
			break;
		case "Oktober":
			this.month = 10;
			break;
		case "November":
			this.month = 11;
			break;
		case "Dezember":
			this.month = 12;
			break;
		default: this.month = 1;
		}
	}

	public int getDay() {
		return day;
	}






	public void setDay(int day) {
		this.day = day;
	}






	public int getMonth() {
		return month;
	}






	public void setMonth(int month) {
		this.month = month;
	}






	public int getYear() {
		return year;
	}






	public void setYear(int year) {
		this.year = year;
	}

}
