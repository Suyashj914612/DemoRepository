package session_4;

public class For_loop {

	public static void main(String[] args) {
		
		//for loop : block of code executes until condition is true 
				// - initialization , condition and incre/decre are written in same or one line 
		
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
		
		System.out.println("----------------  Nested for loop -------------------");
		
		//nested for loop :
		
		for(int line=1; line<=5; line++) {
			for(int astr=1; astr<=line; astr++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------- for each -----------------------");
		
		int[]array = {1,5,8,9,3,7};
		
		for(int numbers: array) {
			System.out.println(numbers);
		}

	}

}
