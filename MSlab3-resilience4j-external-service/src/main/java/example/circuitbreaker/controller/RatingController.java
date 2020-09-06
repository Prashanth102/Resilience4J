package example.circuitbreaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
	
	@GetMapping("/")
	public String disp()
	{
		return "Rating Controller";
	}

}
