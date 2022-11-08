package springBoot.Database.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	// mark to Spring that need dependency injection
	@Autowired
	private CourseRepository topicRepository;

	public List<Course> getAllTopics() {
		List<Course> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Course getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(Course topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Course topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}