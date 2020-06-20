package videosPackage;

import java.util.ArrayList;
import java.util.List;


public class User {

//	atributos
	private String name;
	private String surname;
	private String password;
	private String regDate;
	List <Video> videoList = new ArrayList <Video>();
	
//	constructor
	public User(String name, String surname, String password, String regDate) {
		
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.regDate = regDate;
	}

//	constructor por defecto
	public User() {
	}

	
//	GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setVideo(Video vid) {
		this.videoList.add(vid);
	}
	
	public List<Video> getVideoList(){			
		return videoList;
	}
		
	public String toString(){
        return "User Data: \n" +
                "\tName: "+name+"\n" +
                "\tSurname: "+surname+"\n" +
                "\tRegistration Date: "+regDate;
    }
	
			
}
