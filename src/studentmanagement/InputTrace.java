package studentmanagement;
import java.util.Scanner;

public class InputTrace {
	
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static int readInt(String message) {
		while(true) {
			System.out.println(message);
			
			
			try {
				return Integer.parseInt(sc.nextLine().trim());
			}catch(NumberFormatException ex) {
				System.out.println("please enter the valid number :");
				
			}
		}
		
	}
	
	public static double readDouble(String message) {
		while(true) {
		System.out.println(message);
		try {
			return Double.parseDouble(sc.nextLine().trim());
		}catch(NumberFormatException ex) {
			System.out.println("please enter the valid number");
		}
		}
		
	}
	
	public static String readString(String message) {
		
		while(true) {
			System.out.println(message);
			try {
				String nme = sc.nextLine().trim();
				
				if(nme.isEmpty()) {
					throw new IllegalArgumentException();
					
				}
				return nme;
				
				
				
			}catch(IllegalArgumentException ex) {
				System.out.println("Please enter the valid name :");
			}
			
			
		}
		
		
		
		
		
	}

}
