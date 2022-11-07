package springBootStarted.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicDataController {
	
	// mark to Spring that need dependency injection
	// when Spring creates an instance of TopicController he is going to look all the members,
	// and he is going to see if any of them has a dependency of TopicService, and it will inject that
	@Autowired 	
	private TopicDataService topicService;
	
	@RequestMapping("/topics")
	public List<TopicData> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public TopicData getOneTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody TopicData topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody TopicData topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}



}

