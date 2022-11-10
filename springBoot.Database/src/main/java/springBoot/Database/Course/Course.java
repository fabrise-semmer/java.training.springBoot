package springBoot.Database.Course;

import javax.persistence.Entity;
import javax.persistence.Id;

import springBoot.Database.Topic.Topic;

//to map the class to database - create a table Topic
@Entity
public class Course {

	//the three columns of the table Topic
	//add the annotation @Id to identify the column ID as the primary key
	@Id
	private String id;
	private String name;
	private String description;
	
	private Topic topic;

	public Course() {
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		// when construct a course also take in a topic ID
		this.topic = new Topic(topicId, "", "");

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

	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
