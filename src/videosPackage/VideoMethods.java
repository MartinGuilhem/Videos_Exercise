package videosPackage;


public class VideoMethods {
	
//	Returns an object Video video (title, URL, tags)  
	public static Video addNewVideo() {
		
		String auxcomespacios="";
		char askNewTag;
		Video video= new Video();
		
		
		System.out.println("Add New Video...");
		
		System.out.println("Video Title: ");
		video.setTitle(UserInput.inPut());
		
		System.out.println("URL: ");
		video.setURL(UserInput.inPut());
										
		do {
			System.out.println("Do you want to add a new Tagg? (y/n)");
			
			askNewTag=UserInput.inPut().charAt(0);
			
			if(askNewTag=='y')
			{
				System.out.println("Tag: ");
				video.setTag(UserInput.inPut());
			}
			
		}while(askNewTag=='y');
				
		return video;
	}

//	Shows videos from user
	public static void showVideoList(User user) {
		
		System.out.println("Video list:\n");
		
		for(int i=0; i<user.getVideoList().size(); i++)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("TITLE:");
			System.out.println("\t"+user.getVideoList().get(i).getTitle());
			System.out.println("URL:");
			System.out.println("\t"+user.getVideoList().get(i).getURL());
			System.out.println("TAGS:");
			
			for(int j=0; j<user.getVideoList().get(i).getTagList().size(); j++)
			{
				System.out.println("\t"+user.getVideoList().get(i).getTagList().get(j));
			}
		}
		
	}

//	Deletes a video from user videos with an option number input
	public static void deleteVideo(User user) {
			
		int num=-1;
		
		do {

			System.out.println("\n Select # video you want to delete.. ");
			
			for(int i=0; i<user.getVideoList().size(); i++)
			{
				System.out.println("-----------------------------------------------");
				System.out.println("TITLE:");
				System.out.println("\t"+(i+1)+"- "+user.getVideoList().get(i).getTitle());
			}
			
			System.out.println("\n Select # video you want to delete.. ");
			
			num=Integer.parseInt(UserInput.inPut());
			
			if(num==-1) {
				System.out.println("Error, you must put a correct option... please try again!");
			}
			 
		}while(num==-1);
		
		user.getVideoList().remove(num-1);		
	}

}
