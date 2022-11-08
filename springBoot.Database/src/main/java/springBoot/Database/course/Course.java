package springBoot.Database.course;

import javax.persistence.Entity;
import javax.persistence.Id;

//to map the class to database - create a table Topic
@Entity
public class Course {

	//the three columns of the table Topic
	//to identify the column ID as the primary key
	@Id
	private String id;
	private String name;
	private String description;

	public Course() {
	}

	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
