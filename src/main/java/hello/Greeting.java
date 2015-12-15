package hello;

/**
 * Creating restful Webservices 
 */
public class Greeting {

	public long id;
	public String content;
	
	public Greeting(Long id, String content) {
		this.id = id;
		this.content = content;
	}

	public void setId(long id){
	 	this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}
}
