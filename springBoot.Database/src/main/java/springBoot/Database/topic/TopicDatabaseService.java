package springBoot.Database.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopicDatabaseService {

	private List<TopicDatabase> topics = new ArrayList<>(
			Arrays.asList(new TopicDatabase("spring", "Spring Framework", "Spring Framework Description"),
					new TopicDatabase("java", "Core Java", "Core Java Description"),
					new TopicDatabase("javascript", "JavaScript", "JavaScript Description")));

	public List<TopicDatabase> getAllTopics() {
		return topics;
	}

	public TopicDatabase getTopic(String id) {
		return topics.stream()
				// filter by the id – compare the id in the list with the id in the argument
				.filter(t -> t.getId().equals(id)).findFirst() // find the very first item
				.get(); // return the id found
	}

	public void addTopic(TopicDatabase topic) {
		topics.add(topic);		
	}

	public void updateTopic(String id, TopicDatabase topic) {
		for (int i = 0; i < topics.size(); i++) {
			TopicDatabase t = topics.get(i);
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
