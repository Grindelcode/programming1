package prog1.uebungsblatt1;

public class RectangleArea {

	public static void main(String[] args) {
		int x1,y1, x2,y2;
		
		x1 = Integer.parseInt(args[0]);
		y1 = Integer.parseInt(args[1]);
		x2 = Integer.parseInt(args[2]);
		y2 = Integer.parseInt(args[3]);
		
		int a = (x2-x1)*(y1-y2);
		
		System.out.println("area = " + a);
			
	}

}
