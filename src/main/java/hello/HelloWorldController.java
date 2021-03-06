package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello, World!";
    }

    /*public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }*/
}

