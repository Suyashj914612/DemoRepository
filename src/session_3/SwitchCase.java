package session_3;

public class SwitchCase {

	public static void main(String[] args) {

		int Dist = 6;

		switch(Dist) {

		case 1:
			System.out.println("Parbhani");
			break;								//break; = is used for exists from the loop 
		case 2:
			System.out.println("Nanded");
			break;
		case 3:
			System.out.println("Nashik");
			break;
		case 4:
			System.out.println("Pune");
			break;
		case 5:
			System.out.println("Bhusaval");
			break;
		case 6:
			System.out.println("Amravati");
			break;
		default:
			System.out.println("Invalid city names");
		}
	}
}
