package com.abdulisik.springbootrestful;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@ComponentScan
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.antMatcher("/**").authorizeRequests()
				.antMatchers("/").permitAll()
				.anyRequest().authenticated()
				.and()
				.oauth2Login();
	}
}
