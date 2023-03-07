package com.service2.greetApi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {
//implemetation of calling welcome api happens runtime at cloud using Inteerface only
    @GetMapping("/welcome")
    public String invokeWelcomeApi();
}
