package videosPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserMethods {
		
//	Returns an object User user (name, surname, password, regDate)  
	public static User createNewUser() {
		
		String password, repassword;
				
		System.out.println("Create New User...");
		System.out.println("Name: ");
		String name=UserInput.inPut();
		System.out.println("Surname: ");
		String surname=UserInput.inPut();
		
		do {
			System.out.println("Password: ");
			password=UserInput.inPut();
			System.out.println("Repeat Password: ");
			repassword=UserInput.inPut();
			
			if(!password.equals(repassword)) {
				System.out.println("Passwords must be equals, Please Repeat: ");
			}
			else {
				System.out.println("\nUser Created! \n");
			}
		}while(!password.equals(repassword));
		
		String regDate = UserMethods.getDate();		
		User aux= new User(name, surname, password, regDate);

		return aux;		
	}
	
	
//	Returns the regDate
	public static String getDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		 
		return dtf.format(now);
	}


//	Returns the position int of the user in the users arrayList only if name y password matches or else (-1)
	public static int logIn(List<User> users) {
		
		String name, password;
		int aux=-1;
		
		do {
			System.out.println("Login MENU...");
			System.out.println("Name: ");
			name=UserInput.inPut();
			System.out.println("Password: ");
			password=UserInput.inPut();
		
			for(int i=0; i<users.size(); i++) {
			
				if(equals(name, password, users.get(i)))
				{
					aux=i;
				}
			}
		
			if(aux==-1)
			{
				System.out.println("\n Username or Password is incorrect please input again...");
			}

		}while(aux==-1);
		
		return aux;
	}
	
	
//	Returns true/false if Strings matches
	public static boolean equals(String name, String pass, User user){
		 
        if(user.getName().equals(name) && user.getPassword().equals(pass)){
            return true;
        }else{
            return false;
        }
    }
	
	
//	Connects selected option with method.  
	public static void userMenu(User user)
	{		
		int ask;
		
		
		System.out.println("\nWelcome "+user.getName()+" what do you want to do?");
		
		do {
	
			switch(Views.viewUserMenu())
			{
				case 1:
					user.setVideo(VideoMethods.addNewVideo());
					break;
				case 2:
					VideoMethods.showVideoList(user);
					break;
				case 3:
					VideoMethods.deleteVideo(user);
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
	

//	Shows users list 
	public static void showUserList(List<User> users) {
		
		System.out.println("Lista de nombres de usuarios:\n");
	
		for(int i=0; i<users.size(); i++)
		{
			System.out.println(users.get(i).toString());
			System.out.println("-----------------------------------------------");
		}
		
	}	
}
