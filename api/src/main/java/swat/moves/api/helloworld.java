package swat.moves.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class helloworld {

  private static final String template = "Hello World";
    @GetMapping("/hello")
    public String hello()   
    {  
    return "Hello Team 5";  
    }  
  }
