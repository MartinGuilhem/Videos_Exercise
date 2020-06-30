package videosPackage;

public class Views {
		
//	METODOS
	
	
	public static int viewMainMenu()
	{		
		int optionMainMenu=0;
		boolean c=false;
		
		do {
			c=false;
			System.out.println("-----------------------------------------------");
			System.out.println("\n\tWelcome to VideoApp");
			System.out.println("Choose an option: ");
			System.out.println("1. Create New User");
			System.out.println("2. LogIn");
			System.out.println("3. Show User List");
			System.out.println("4. Exit");
			try {
				optionMainMenu=Integer.parseInt(UserInput.inPut());
			}
			catch(NumberFormatException e) {
				c=true;
			}
			
			if(optionMainMenu!=1 && optionMainMenu!=2 && optionMainMenu!=3 && optionMainMenu!=4)
			{
				System.out.println("\n You must put a correct option... please try again\n");
			}
			
		}while(optionMainMenu!=1 && optionMainMenu!=2 && optionMainMenu!=3 && optionMainMenu!=4 || c==true);
		
		return optionMainMenu;		
	}
	
	
	
	public static int viewUserMenu()
	{
		int optionUserMenu=0;
		boolean c=false;		
		
		do {
			c=false;				
			System.out.println("\nChoose an option: ");
			System.out.println("1. Add New Video");
			System.out.println("2. Show Video List");
			System.out.println("3. Delete Video From List");
			System.out.println("4. Exit");
			
	
			try {
				optionUserMenu=Integer.parseInt(UserInput.inPut());
			}catch(NumberFormatException e) {
				c=true;
			}
						
			if(optionUserMenu!=1 && optionUserMenu!=2 && optionUserMenu!=3 && optionUserMenu!=4)
			{
				System.out.println("\n You must put a correct Input... please try again\n");
			}
			

		}while(c==true || optionUserMenu!=1 && optionUserMenu!=2 && optionUserMenu!=3 && optionUserMenu!=4);
		
		return optionUserMenu;		
	}
	
}

