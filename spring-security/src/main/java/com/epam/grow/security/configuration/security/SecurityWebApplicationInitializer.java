package com.epam.grow.security.configuration.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(WebJavaSecurityConfig.class, WebXmlSecurityConfig.class);
    }

}
