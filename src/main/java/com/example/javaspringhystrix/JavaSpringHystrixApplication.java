package com.example.javaspringhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableAutoConfiguration
@SpringBootApplication
public class JavaSpringHystrixApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JavaSpringHystrixApplication.class, args);
    }
}
