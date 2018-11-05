package exercise1;

public class TestMyPoint {
	public static void main(String[] args) {
		MyPoint start = new MyPoint(10, 10);
		MyPoint end = new MyPoint(20, 30);
	
		System.out.println("Start point is " + start.toString());
		System.out.println("end point is " + end.toString());
		System.out.println("\n");
		
		@SuppressWarnings("unused")
		MyPoint stary = end;
		
		System.out.println("end point is " + end.toString());
		System.out.println("stary point is " + stary.toString());
		System.out.println("\n");
		
		stary.x = 666;
		stary.y = 777;

		System.out.println("Start point is " + start.toString());
		System.out.println("end point is " + end.toString());
		System.out.println("stary point is " + stary.toString());
	}	
}
