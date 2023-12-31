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

    // Versioning with path
    @GetMapping("/v1/hello-world-version")
    public String greetTheUserV1() {
        return "Hello World v1";
    }

    @GetMapping("/v2/hello-world-version")
    public String greetTheUserV2() {
        return "Hello World v2";
    }

    // Versioning with params
    @GetMapping(path = "/hello-world-version", params = "version=1")
    public String greetTheUserWithParamsV1() {
        return "Hello World V1";
    }

    @GetMapping(path = "/hello-world-version", params = "version=2")
    public String greetTheUserWithParamsV2() {
        return "Hello World V2";
    }

    // Versioning with headers
    @GetMapping(path = "/hello-world-version", headers = "X-API-VERSION=1")
    public String greetTheUserWithHeadersV1() {
        return "Hello World V1";
    }

    @GetMapping(path = "/hello-world-version", headers = "X-API-VERSION=2")
    public String greetTheUserWithHeadersV2() {
        return "Hello World V2";
    }

    // Versioning with application type
    @GetMapping(path = "/hello-world-version", produces = "application/vnd.company.app-v1+json")
    public String greetTheUserWithApplicationTypeV1() {
        return "Hello World V1";
    }

    @GetMapping(path = "/hello-world-version", produces = "application/vnd.company.app-v2+json")
    public String greetTheUserWithApplicationTypeV2() {
        return "Hello World V2";
    }

}
