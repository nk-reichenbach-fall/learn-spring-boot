package com.mycompany.learnjavaspringboot.helloWorld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class helloWorldController {

    @GetMapping(path = "/hello-world-bean")
    public helloWorld getHelloWorld() {
        return new helloWorld("Hello World");
    }

    // Path Variable
    @GetMapping("/hello-world/path-variable/{name}/age/{age}")
    public helloWorld greetUser(@PathVariable String name, @PathVariable String age) {
        return new helloWorld(String.format("Hello %s, Your age is %s", name, age));
    }

}
