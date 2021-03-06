package spring.sample.requesthandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RequesthandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequesthandlerApplication.class, args);
	}


	@GetMapping(value = "/test/{id}")
	public String test(@PathVariable String id){
		return id;
	}
}
