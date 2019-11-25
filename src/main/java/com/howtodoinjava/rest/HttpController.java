package com.howtodoinjava.rest;

import java.net.URI;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/")
public class HttpController 
{

    @Value("${server.helloreceiver:World}")
    private String helloreceiver;

    @GetMapping(path="/", produces = "text/plain")
    public String httpResponse() 
    {
        return String.format("Hello %s", helloreceiver);
    }

}