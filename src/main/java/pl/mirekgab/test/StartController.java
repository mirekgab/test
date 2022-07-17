package pl.mirekgab.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/api")
    public String api() { return "api";}

}
