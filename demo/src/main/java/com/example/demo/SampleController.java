package  com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !";
    }

    @GetMapping("/committest")
    public String commitTest() {return "안녕하세요!";}

}

