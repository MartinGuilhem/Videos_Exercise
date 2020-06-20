package videosPackage;

import java.util.*;

public class Video {
	
//	atributos
	private String title;
	private String URL;
	private List<String> tagList = new ArrayList<>();

//	constructor
	public Video(String title, String URL) {
		
		this.title = title;
		this.URL = URL;
		this.tagList = tagList;
	}

//	constructor por defecto
	public Video() {
	}

	
//	GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public List<String> getTagList() {
		return tagList;
	}

	public void setTag(String tag) {
		this.tagList.add(tag);
	}
	
}
