package com.example.springbootdockerrestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DemoConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity webSecurity) throws Exception {
        webSecurity.ignoring()
                .antMatchers("/api/demo/home")
                .antMatchers("/api/patient/**")
                .antMatchers("/api/doctor/**");

    }

}
