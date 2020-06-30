package videosPackage;

import java.util.Scanner;

public class UserInput {
	
	public static String inPut()
	{
		Scanner sc = new Scanner(System.in);
		
		String input=sc.nextLine();
		
		return input;
	}
	
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

}
