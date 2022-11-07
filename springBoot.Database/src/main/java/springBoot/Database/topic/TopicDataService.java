package springBoot.Database.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicDataService {

	private List<TopicData> topics = new ArrayList<>(
			Arrays.asList(new TopicData("spring", "Spring Framework", "Spring Framework Description"),
					new TopicData("java", "Core Java", "Core Java Description"),
					new TopicData("javascript", "JavaScript", "JavaScript Description")));

	public List<TopicData> getAllTopics() {
		return topics;
	}

	public TopicData getTopic(String id) {
		return topics.stream()
				// filter by the id – compare the id in the list with the id in the argument
				.filter(t -> t.getId().equals(id)).findFirst() // find the very first item
				.get(); // return the id found
	}

	public void addTopic(TopicData topic) {
		topics.add(topic);		
	}

	public void updateTopic(String id, TopicData topic) {
		for (int i = 0; i < topics.size(); i++) {
			TopicData t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

	

}
