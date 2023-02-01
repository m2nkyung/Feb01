public class Circle {
	private int radius = 0;
	private Point center;
	
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	public String toString() {
		String s = center.toString();
		s += "반지름 : " + radius;
		
		return s;
	}
}