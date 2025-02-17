package com.wilkerjcpimenta.spacex_launches.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite acesso ao endpoint /graphql de qualquer origem
        registry.addMapping("/graphql")
                .allowedOrigins("http://localhost:8080")  // Altere para o domínio correto
                .allowedMethods("POST", "GET");  // Permite apenas métodos POST e GET
    }
}
