package springBoot.Database.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicDatabaseController {

		// mark to Spring that need dependency injection
		// when Spring creates an instance of TopicController he is going to look all the members,
		// and he is going to see if any of them has a dependency of TopicService, and it will inject that
		@Autowired 	
		private TopicDatabaseService topicDatabaseService;
		
		@RequestMapping("/topics")
		public List<TopicDatabase> getAllTopics() {
			return topicDatabaseService.getAllTopics();
		}
		
		@RequestMapping("/topics/{id}")
		public TopicDatabase getOneTopic(@PathVariable String id) {
			return topicDatabaseService.getTopic(id);
		}

		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody TopicDatabase topic) {
			topicDatabaseService.addTopic(topic);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic(@RequestBody TopicDatabase topic, @PathVariable String id) {
			topicDatabaseService.updateTopic(id, topic);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			topicDatabaseService.deleteTopic(id);
		}


}
