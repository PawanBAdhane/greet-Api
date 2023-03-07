package com.service2.greetApi.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {

}
