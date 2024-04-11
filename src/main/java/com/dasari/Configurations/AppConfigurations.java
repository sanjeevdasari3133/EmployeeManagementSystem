package com.dasari.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfigurations {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorize -> authorize
                                .requestMatchers(HttpMethod.GET, "/api/home").authenticated()
                                
                                .requestMatchers(HttpMethod.POST, "/api/**").authenticated()
                                .anyRequest().permitAll()

                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());

        return http.build();

    }
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
		
	}

}
