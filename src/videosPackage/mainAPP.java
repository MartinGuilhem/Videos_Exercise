package videosPackage;

import java.util.ArrayList;
import java.util.List;

public class mainAPP {

	public static void main(String[] args) {
		
		
		List<User> users = new ArrayList<User>();
		int iuser, ask=1;

		
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
	        		System.out.println("\nExit...");
	        		ask=0;	        		
	        		
	        		break;	        			        			
			}
		
						
		}while(ask==1);			
	}
	
	
}
