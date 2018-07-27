package com.example.javaspringhystrix.implementation.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.exception.HystrixRuntimeException;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HystrixService
{
    @HystrixCommand(commandKey = "hystrix-command"
            , groupKey = "hystrix-group"
            , fallbackMethod = "hystrixFallback")
    @GetMapping("/test")
    public String hystrixTest()
    {
        if (RandomUtils.nextBoolean())
            throw new RuntimeException();

        return "{\"service\":\"java-spring-hystrix\",\"status\":\"success\"}";
    }

    public String hystrixFallback()
    {
        return "{\"service\":\"java-spring-hystrix\",\"status\":\"fallback success\"}";
    }
}
