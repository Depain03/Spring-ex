package com.javatpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController  
public class HomeController {  
    @RequestMapping(value="/hello", method=RequestMethod.GET)  
    public String hello() { 
    	String json = "http://headers.jsontest.com/";
    	RestTemplate restTemplate = new RestTemplate();
    	String result=restTemplate.getForObject(json, String.class );
    	System.out.println(result);
				return result;  
				//
}  
}