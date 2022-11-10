package springBoot.Database.Course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBoot.Database.Topic.Topic;

@RestController
public class CourseController {
	
	// mark to Spring that need dependency injection
	// when Spring creates an instance of TopicController he is going to look all the members,
	// and he is going to see if any of them has a dependency of TopicService, and it will inject that
	@Autowired 	
	private CourseService courseService;
	
	@RequestMapping("/topics")
	public List<Course> getAllTopics() {
		return courseService.getAllTopics();
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/course")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		//we don’t have to provide the full Topic instance
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}



}

