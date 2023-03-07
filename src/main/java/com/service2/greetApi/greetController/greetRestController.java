package com.service2.greetApi.greetController;

import com.service2.greetApi.client.WelcomeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetRestController {

    @Autowired
    public WelcomeApiClient welcomeapiClient;

    @GetMapping("/greet")
    public String getGreetMessage(){
        String greetMessage="Good Morning,";
        String welcomeMessage=welcomeapiClient.invokeWelcomeApi();
        return greetMessage + welcomeMessage;
    }
}
