package com.configclient.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${app.name:DefaultName}")
    private String userName;

    @GetMapping("/username")
    private String getUserName(){
        return userName;
    }
}
