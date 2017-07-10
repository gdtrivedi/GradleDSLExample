package com.gogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by gtrivedi on 7/6/17.
 */

@SpringBootApplication
@ComponentScan
public class GradleDSLExampleApp {

    // Main method
    public static void main(String[] args) {
        SpringApplication.run(GradleDSLExampleApp.class, args);
    }

    @Bean
    public WebMvcConfigurerAdapter adapter() {
        return new WebMvcConfigurerAdapter() {

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
            }
        };
    }

}
