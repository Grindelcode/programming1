package prog1.uebungsblatt6;

public class Triangle {
	
	private Point p0;
	private Point p1;
	private Point p2;
	
	public Triangle(Point p0, Point p1, Point p2) {
		this.p0 = p0;
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	

	public Point getP0() {
		return p0;
	}



	public Point getP1() {
		return p1;
	}



	public Point getP2() {
		return p2;
	}

	public double perimeter() {
		return p0.distance(p1)+ p1.distance(p2) + p2.distance(p0);
	}
	
	public double area() {
		double area = Math.abs(((p1.x()-p0.x())*(p2.y()-p0.y()))-((p2.x()-p0.x())*(p1.y()-p0.y())))/2;
		
		return area;
	}
	
	public Point lowerLeft() {
		return new Point(Math.min(p0.x(), Math.min(p1.x(), p2.x())), Math.min(p0.y(), Math.min(p1.y(), p2.y())));
	}
	
	public Point upperRight() {
		return new Point(Math.max(p0.x(), Math.max(p1.x(), p2.x())), Math.max(p0.y(), Math.max(p1.y(), p2.y())));
	}
	
	public Triangle moved (double dx, double dy) {
		return new Triangle(p0.moved(dx, dy), p1.moved(dx, dy), p2.moved(dx, dy));
	}
	
	public Triangle zoomed(double f) {
		return new Triangle (	new Point(p0.x()*f,p0.y()*f),
								new Point(p1.x()*f,p1.y()*f),
								new Point(p2.x()*f,p2.y()*f));
	}
	
	public Triangle zoomed(Point p, double f) {
		return moved (-p.x(), -p.y()).zoomed(f).moved(p.x(), p.y());
		
	}

	public static void main(String[] args) {
		Triangle t1 = 	new Triangle(new Point(-1,0),
						new Point(0,2),
						new Point(1,0));
		
					System.out.println(t1.perimeter()); //6.47
					System.out.println(t1.area());
					
		Triangle t2 = t1;
		t2 = t2.zoomed(new Point(0,1), -1);
		t2 = t2.moved(0, -1);
		
		// Ausgabe des umschlieﬂenden Rechtecks
		
		System.out.println(t2.lowerLeft()); // -1 -1
		System.out.println(t2.upperRight()); // 1 1

	}

}
