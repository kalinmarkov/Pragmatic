package edu.pragmatic.loops.inclass;

public class WhileExample {
	
	public static void main(String[] args) {
		
		int index = 5;
//		while( true ) 
//			System.out.println("Current number :" + index++);
//		do {
//			System.out.println(index);
//			System.out.println("Something else ");
//		}while ( index > 5  );
		
		for (int i = 1; i < 10   ; i++ ) {
			if ( i % 2 == 0)
			   break;
			System.out.println(i);
		}
		
		
	}

}
