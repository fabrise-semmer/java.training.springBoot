package springBoot.Database.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicDataService {

	// mark to Spring that need dependency injection
	@Autowired
	private TopicRepository topicRepository;

	public List<TopicData> getAllTopics() {
		List<TopicData> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public TopicData getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	public void addTopic(TopicData topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, TopicData topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
