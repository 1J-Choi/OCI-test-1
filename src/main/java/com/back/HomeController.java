package com.back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
                <h1>Welcome to the Home Page!</h1>
                <p>This is a Demo Spring Boot application.</p>
                <p>나 최원제는 Oracle Cloud를 통해 배포를 할 수 있다!</p>
                """;
    }
}
