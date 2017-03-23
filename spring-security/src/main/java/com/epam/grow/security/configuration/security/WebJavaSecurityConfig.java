package com.epam.grow.security.configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@ComponentScan({
        "com.epam.grow.security"
})
@Profile("javaConfig")
public class WebJavaSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String ADMIN_AUTHORITY = "ADMIN";

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/about.jsp")
                    .permitAll()
                .antMatchers("/admin/**")
                    .hasAuthority(ADMIN_AUTHORITY)
                .anyRequest()
                    .authenticated()
                .and()
                    .formLogin()
                    .usernameParameter("username")
                    .passwordParameter("password")
                .and()
                    .httpBasic()
                .and()
                    .logout()
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/successLogout.jsp")
                        .clearAuthentication(true)
                        .invalidateHttpSession(true)
                .and()
                    .csrf()
                        .disable();
    }

}
