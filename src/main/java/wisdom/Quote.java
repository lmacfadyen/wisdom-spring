package wisdom;

import org.springframework.data.annotation.Id;
import java.util.Date;


public class Quote {

	@Id private String id;

	private String text;
	private String author;
	private boolean local = false;
	private Date createdAt = new Date();
	private Date activeAt = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isLocal() {
		return this.local;
	}

	public void setLocal(boolean active) {
		this.local = local;
	}

	public void setCreatedAt(Date date) {  
    		this.createdAt = (Date) date.clone();  
	}  
  
	public Date getCreatedAt() {  
    		return (Date) this.createdAt.clone();  
	}

	public void setActiveAt(Date date) {  
    		this.activeAt = (Date) date.clone();  
	}  
  
	public Date getActiveAt() {  
    		return (Date) this.activeAt.clone();  
	}

	
}