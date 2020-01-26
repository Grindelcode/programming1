package prog1.uebungsblatt6;



public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time(13,46,56);
		Time time2 = new Time(time1);
		Time time3 = new Time();
		
		System.out.println("Time1: " + time1.toString());
		System.out.println("Time2: " + time2.toString());
		System.out.println("Time3: " + time3.toString());
		
		Time time = new Time(12,00,55);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			time.tick();
			System.out.println("Current Time: " + time.toString());
		}

	}

}
