package com.zy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.zy.controller","com.zy.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
