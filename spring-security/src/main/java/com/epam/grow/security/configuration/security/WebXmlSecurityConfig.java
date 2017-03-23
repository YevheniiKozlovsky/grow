package com.epam.grow.security.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:spring-security.xml")
public class WebXmlSecurityConfig {
}
