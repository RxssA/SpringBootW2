package ie.atu.springboot.springbootw2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Your name is " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name,
                          @RequestParam int age){
        return name + "has just turned" + age;
    }


}
