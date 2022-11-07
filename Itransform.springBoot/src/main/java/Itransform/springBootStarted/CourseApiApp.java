package Itransform.springBootStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//tell this is a spring class, and this is the start
@SpringBootApplication
// if have different names packages add the annotation @ComponentScan
//@ComponentScan(basePackages = "Itransform.springBootStarted.hello, Itransform.springBootStarted.topic")
public class CourseApiApp {

	public static void main(String[] args) {
		// this is the spring application
		// first argument - the name class with the main method
		// second argument – the args passed in the main method
		SpringApplication.run(CourseApiApp.class, args);
	}

}
