package com.flamenik.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain (ServerHttpSecurity http) {
       return http
               .csrf(csrf->
                    csrf.disable())
               .authorizeExchange(authorizeExchangeSpec ->
                       authorizeExchangeSpec.anyExchange().authenticated())
               .oauth2Login(Customizer.withDefaults())
               .build();

    }
}
