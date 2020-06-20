package videosPackage;

import java.util.ArrayList;
import java.util.List;

public class mainAPP {

	public static void main(String[] args) {
		
		
		List<User> users = new ArrayList<User>();
		int ask, iuser;
		
		
		do {
			switch(Views.viewMainMenu())
			{
	        	case 1:
	        		users.add(UserMethods.createNewUser());
	        		break;
	        	case 2:
	        		iuser=UserMethods.logIn(users);
	     			UserMethods.userMenu(users.get(iuser));
	        		break;
	        	case 3:
	        		System.out.println("\nShow User List...");
	        		UserMethods.showUserList(users);
	        		break;
	        	case 4:
	        		//"exit"
	        		System.out.println("\nExit...");
	        		break;	        			        			
			}
						
			System.out.println("\n\tPress '1' to continue operating.\n");
			ask=Integer.parseInt(UserInput.inPut());
			
						
		}while(ask==1);			
	}
	
	
	
	

}
