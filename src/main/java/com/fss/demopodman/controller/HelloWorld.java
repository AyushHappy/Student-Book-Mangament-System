package com.fss.demopodman.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class HelloWorld {
    @GetMapping(path = "/Podman/demo/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping(path = "/HI")
    public String hi(){
        return "hi";
    }

    @Value("${message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }

    @Value("${external.config.file}")
    private String configFilePath;

    @GetMapping("/config")
    public String getConfig() throws IOException {
        return Files.readString(Path.of(configFilePath));
    }


}
