package com.example.demo.Application;

// Em sua classe principal, geralmente rotulada como Application.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/src/main/java/com/example/demo/controllers/TaskController.java") // ou o caminho específico do seu controller
                        .allowedOrigins("/src/main/resources/static/index.html")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
