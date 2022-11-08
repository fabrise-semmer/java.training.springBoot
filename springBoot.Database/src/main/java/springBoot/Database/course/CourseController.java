package springBoot.Database.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	// mark to Spring that need dependency injection
	// when Spring creates an instance of TopicController he is going to look all the members,
	// and he is going to see if any of them has a dependency of TopicService, and it will inject that
	@Autowired 	
	private CourseService topicService;
	
	@RequestMapping("/datatopics")
	public List<Course> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/datatopics/{id}")
	public Course getOneTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/datatopics")
	public void addTopic(@RequestBody Course topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/datatopics/{id}")
	public void updateTopic(@RequestBody Course topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/datatopics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}



}

