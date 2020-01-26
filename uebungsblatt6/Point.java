package prog1.uebungsblatt6;

public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;		
	}
	
	public double x() {
		return x;
	}
	
	public double y() {
		return y;
	}
	
	public String toString() {
		return "x: "+ x + " y: " + y;
	}
	
	public double distance(Point p)  {
		return Math.hypot(x - p.x(), y - p.y());
	}
	
	public Point moved(double dx, double dy) {
		return new Point (x + dx, y + dy);
		
	}
}
