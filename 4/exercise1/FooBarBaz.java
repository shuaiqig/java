package exercise1;

public class FooBarBaz {
	
	public static void main(String[] args) {
		
		int number = 1;
		
		for(; number <= 50; number++) {
			
			System.out.print(number);
			if(number % 3 == 0) {
				System.out.print(" foo");
			}
			if(number % 5 == 0) {
				System.out.print(" bar");
			}
			if(number % 7 == 0) {
				System.out.print(" baz");
			}
			System.out.println();
		}
	}
}
