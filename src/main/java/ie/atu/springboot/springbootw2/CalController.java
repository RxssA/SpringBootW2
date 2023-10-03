package ie.atu.springboot.springbootw2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {
    @GetMapping("/calculate")
    public String calculate (@RequestParam float num1, @RequestParam float num2, @RequestParam String operation){
        float result = 0;
        if ("add".equals(operation)){
            result = num1 + num2;
        } else if ("substract".equals(operation)) {
            result = num1 - num2;
        } else if ("multiply".equals(operation)) {
            result = num1 * num2;
        } else if ("divide".equals(operation)) {
            if(num2 != 0){
                result = num1 / num2;
            }else{
                throw new IllegalArgumentException("Cant Divide by Zero, Give a valid value.");
            }
        }else{
            throw new IllegalArgumentException("Invalid operation. Give input in Lowercase."+ operation);
        }
        return "{\"operation\": \"" + operation + "\", \"result\": " + result + "}";
    }
    }





