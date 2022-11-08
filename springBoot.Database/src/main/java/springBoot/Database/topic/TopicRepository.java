package springBoot.Database.topic;

import org.springframework.data.repository.CrudRepository;

// JPA will create all the methods standard 
//CrudRepository is generic, you have to specify the type and the type from @Id
public interface TopicRepository extends CrudRepository<TopicData, String>{

}
