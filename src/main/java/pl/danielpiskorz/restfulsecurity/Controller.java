package pl.danielpiskorz.restfulsecurity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("public/{{stuff}}")
	public String getPublicData(@PathVariable String stuff){
		return "Public stuff: " + stuff;
	}
	
	@RequestMapping("private/{{stuff}}")
	public String getPrivateData(@PathVariable String stuff){
		return "Private stuff: " + stuff;
	}
}
