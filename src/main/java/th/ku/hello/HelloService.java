package th.ku.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/greeting"})
public class HelloService {

    @GetMapping("/hello")
    public String hello(){
        return "<html><h1>Hello World</h1></html>";
    }

    @GetMapping("/hi")
    public String hi(){
        return "Hi";
    }
}
