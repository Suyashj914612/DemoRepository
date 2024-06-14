package session_5;

public class One_Dim_Array {

	public static void main(String[] args) {
		
		//declaration and instantiate array
		int roll[] = new int[5];
		
		//insert values in array
		roll[0]=12;
		roll[1]=13;
		roll[2]=14;
		roll[3]=15;
		roll[4]=16;
		
		//print size of an array 
		System.out.println("size of an array : " +roll.length);
		
		//read values from an array
		System.out.println("Element at index 2 is :" +roll[2]);
		
		//print array by using for loop 
		for(int i=0; i<roll.length; i++) {
			System.out.println(roll[i]);
		}
		
		System.out.println("------- While Loop -----------");
		
		//print array by using while loop
		int a = 0;
		while(a<roll.length) {
			System.out.println(roll[a]);
			a++;
		}
		
		System.out.println("------- do-while Loop -----------");
		
		//print array by using do-while loop
		int s = 0;
		do {
			System.out.println(roll[s]);
			s++;
		}while(s<roll.length);
		
		
		//print array by using for each loop ---very shortcut to print or read array --
		
		

	}

}
