package com.mycompany.learnjavaspringboot.helloWorld;

import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class helloWorldController {

    private MessageSource messageSource;

    public helloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping(path = "/hello-world-bean")
    public helloWorld getHelloWorld() {
        return new helloWorld("Hello World");
    }

    // Path Variable
    @GetMapping("/hello-world/path-variable/{name}/age/{age}")
    public helloWorld greetUser(@PathVariable String name, @PathVariable String age) {
        return new helloWorld(String.format("Hello %s, Your age is %s", name, age));
    }

    @GetMapping("/hello-world-international")
    public String internationalResponse() {
        Locale localeContext = LocaleContextHolder.getLocale();

        return messageSource.getMessage("good.morning.message", null, "Default Message", localeContext);
    }
}
