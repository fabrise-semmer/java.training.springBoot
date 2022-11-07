package Itransform.springBootStarted.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//with this annotation to tell spring this is the Rest Controller
@RestController
public class HelloController {

	// maps o know when run this method
	@RequestMapping("/hello")
		public String sayHi(){
			return "Hi";
		}

}
