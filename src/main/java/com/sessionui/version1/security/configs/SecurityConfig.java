package com.sessionui.version1.security.configs;

import com.sessionui.version1.service.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
/*@CrossOrigin(origins = {"http://localhost:4200"})*/
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
      http.csrf().disable()
        .cors().and()
        /*.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())*/
        .httpBasic()
        .and()
        .authorizeRequests()
        .antMatchers("/signup").permitAll()
        .anyRequest().authenticated()
        .and().formLogin()
        .and()
        .logout();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
       /* auth.inMemoryAuthentication()
                .withUser("norayrgh@qwe").password("$2a$10$Z5lOtENayPAPn5CbGw27SuDbsxkXc3x474W8SOLlbtaHP09FTiV.m").roles("ADMIN")
                .and()
                .withUser("norayrgh@asd").password("$2a$10$Z5lOtENayPAPn5CbGw27SuDbsxkXc3x474W8SOLlbtaHP09FTiV.m").roles("USER");*/
    }
}
