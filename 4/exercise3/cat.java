package exercise3;

public class cat {

	public static boolean isSubString(String a, String b) {
		
		boolean judge = false;
		
		for(int i = 0; i < b.length(); i++) {
			if(a.charAt(0) == b.charAt(i)) {
				judge = true;
				int k = i;
				for( int j = 0; j < a.length(); j++,k++ ) {
					
					if(a.charAt(j) != b.charAt(k)) {
						judge = false;
					}
				}					
			}
		}
		
		if(judge)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isSubString("hat.", "The cat in the hat."));
	}
}

	