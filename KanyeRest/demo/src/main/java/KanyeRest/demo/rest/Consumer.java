package KanyeRest.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer {
	public final static String restUri = "https://api.kanye.rest/";
	
	@GetMapping(value = "/api/")
	@ResponseBody
	public static String getQuote() {
		RestTemplate restTemplate = new RestTemplate();
		ModelQuote result = restTemplate.getForObject(restUri, ModelQuote.class);
		return result.getQuote();
	}
	
}
