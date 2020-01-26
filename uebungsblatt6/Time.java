package prog1.uebungsblatt6;

import java.text.DecimalFormat;

public class Time {
	 
	private int hour; //0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// Time constructor initializes each instance variable
	// to zero. Ensures that Time object starts in a 
	// consistent state.
	
	public Time()
	{
		setTime( 0, 0, 0);
	}
	
	// Time constructor: hour supplied, minute and second
	// defaulted to 0
	
	public Time(int h)
	{
		setTime ( h, 0, 0);
	}
	
	// Time constructor: hour and minute supplied, second
	// defaulted to 0
	
	public Time(int h, int m)
	{
		setTime( h, m, 0);
	}
	
	// Time constructor: hour, minute and second supplied 
	
	public Time (int h,int m,int s)
	{
		setTime( h, m, s);
	}
	
	// Time constructor: another Time onject supplied
	
	public Time (Time time)
	{
		setTime (time.getHour(), 	
				time.getMinute(),
				time.getSecond() );
	}
	
	// Set Methods 
	// Set a new time value using universal time. Perform
	// validity checks on data. Set invalid values to zero.
	
	public void setTime (int h,int m,int s)
	{
		setHour(h);  // Set the hour
		setMinute(m); // Set the minute
		setSecond(s); // Set the second
	}
	
	// Validate and set hour
	
	public void setHour(int h)
	{
		hour = ( ( h >= 0 && h < 24 ) ? h : 0);
	}
	
	// Validate and set Minute
	public void setMinute(int m)
	{
		minute = ( ( m >= 0 && m < 60) ? m : 0);
	}
	
	// Validate and set Second
	public void setSecond(int s)
	{
		second = ( ( s >= 0 && s < 60) ? s : 0);
	}
	
	// Get Methods
	// get hour value
	
	public int getHour()
	{
		return hour;
	}
	
	// Get minute value
	
	public int getMinute() 
	{
		return minute;
	}
	
	// Get Second value
	
	public int getSecond() 
	{
		return second;
	}
	
	public void tick()
	{
		setSecond(second + 1);
		
		if(second == 0) {
			incrementMinute();
		}
		
	}
	
	public void incrementMinute()
	{
		setMinute(minute + 1);
		
		if(minute == 0) {
			incrementHour();
		}
	}
	public void incrementHour()
	{
		setHour(hour + 1);
	}
	
	// convert to String in standard-time format
	
	public String toString()
	{
		DecimalFormat twoDigits = new DecimalFormat( "00" );
		
		return ( ( getHour() == 12 || getHour() == 0 ) ?
				12 : getHour() % 12) + ":" +
				twoDigits.format( getMinute() ) + ":" +
				twoDigits.format( getSecond() ) +
				(getHour() < 12 ? " AM" : " PM" );
	}
	
	
	public static void main(String[] args) {


	}

}
