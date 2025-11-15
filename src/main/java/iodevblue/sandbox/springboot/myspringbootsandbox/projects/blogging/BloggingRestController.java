package iodevblue.sandbox.springboot.myspringbootsandbox.blogging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BloggingRestController {
     
    @GetMapping("/blogging")
    public String blogging() {
        return "Welcome to the Blogging Section! 📝";
    }
}
