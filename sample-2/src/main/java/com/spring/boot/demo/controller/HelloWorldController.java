package com.spring.boot.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {

        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Hello</title>
                </head>
                <body style="background-color:#1e1e1e; display:flex; justify-content:center; align-items:center; height:100vh; margin:0;">
                    <h1 style="color:#00ff88; font-family:Arial, sans-serif; font-size:64px;">
                        Hello World
                    </h1>
                </body>
                </html>
                """;
    }
}