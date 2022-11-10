package springBoot.Database.Topic;

import org.springframework.data.repository.CrudRepository;

// CrudRepository has all the common methods you just have to implement the special methods that you need
public interface TopicRepository extends CrudRepository<Topic, String>{

}
