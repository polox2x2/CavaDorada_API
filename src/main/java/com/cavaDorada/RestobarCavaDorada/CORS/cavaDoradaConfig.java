package com.cavaDorada.RestobarCavaDorada.CORS;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class cavaDoradaConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:5173","https://cavadorada-d2508.web.app")
                .allowedMethods("GET","PUT","POST","DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
