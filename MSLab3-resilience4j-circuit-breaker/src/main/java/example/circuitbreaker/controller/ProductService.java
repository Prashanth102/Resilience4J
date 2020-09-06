package example.circuitbreaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ProductService {

	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${external.service.url}")
    private String externalServiceUrl;
	
	
	@GetMapping("/circuit")
	@CircuitBreaker(name = "externalService", fallbackMethod = "getFallbackRatings")
	public String info()
	{
		String msg = restTemplate.getForObject(externalServiceUrl,String.class);
		return msg;
	}
	
	public String getFallbackRatings(Exception e)
	{
		return "Default messaage ... Fallback Rating";
	}
	
}
