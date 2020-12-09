package day3afternoon.geometry;

public class GeometryRunner {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point(p1);
		
		
		
		p1.setPoint(5,  -7);
		p3.moveX(4);
		System.out.println(p1);
		
		System.out.println(p1.getDegrees() + ": " + p1.getDistance());
		
		p2.setPoint(2,  12);
		p2.moveX(3);
		p2.moveY(-5);
		System.out.println(p2);
		System.out.println(p1.equals(p3));


	}

}
