package exercise1;

public class TestArrays {
	
	public static void printArray(int[] array) {
	    System.out.print('<');
	    for ( int i = 0; i < array.length; i++ ) {
	      // print an element
	      System.out.print(array[i]);
	      // print a comma delimiter if not the last element
	      if ( (i + 1) < array.length ) {
		System.out.print(", ");
	      }
	    }
	    System.out.print('>');
	  }
	
	public static void main(String[] argc) {
		
		int [] Array2;	
		int [] Array1= {2,3,5,7,11,13,17,19};
		
		printArray(Array1);
		System.out.println();
		Array2 = Array1;
		for(int i = 0; i < Array2.length; i+=2) {
			Array2[i] = i;
		}
		
		printArray(Array2);
		
		int[][] matrix = new int[5][];
		
		for(int i = 0; i < matrix.length; i++) {
			
			matrix[i] = new int[i];
			for(int j = 0; j < i; j++) {
				matrix[i][j] = i * j;
			}
			
			System.out.println();
			printArray(matrix[i]);
		}
	}
	
	
	
}
