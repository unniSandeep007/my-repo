package com.first.springDemo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.first.springDemo.mapper")
public class UserConfig {
}