package ie.atu.springboot.springbootw2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


}
