package com.namayatri.namayatri.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{

        //hcd^2

        http.csrf(csrf->csrf.disable()).cors(cors->cors.disable());

        //haap

        http.authorizeHttpRequests(auth->auth.anyRequest().permitAll());

        return http.build();

    }
}
