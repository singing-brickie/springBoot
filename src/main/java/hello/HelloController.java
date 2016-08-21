package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {


    @RequestMapping("/greeting")
    public String index(@RequestParam(value="name", required=false, defaultValue="john") String name) {
        return "hi "+ name+" Greetings from Spring Boot!";
    }

}
