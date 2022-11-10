package springBoot.Database.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{

	// Spring Data JPA takes in the topicId and does a search in the database in the topic table for all the topics that have the id property 
	public List<Course> findByTopicId(String Id);
	

}
