package com.gopang.gatewayserver.filters;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class CorsConfig implements WebFluxConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*") // 요청에 허용할 헤더
                .exposedHeaders("*")            // 응답에 허용할 헤더
                .allowCredentials(true).maxAge(3600);            // 인증 정보 유무

    }
}
