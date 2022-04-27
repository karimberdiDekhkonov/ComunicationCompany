package uz.pdp.comunicationcompany.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/card").hasAnyRole("USER","MANAGER","DIRECTOR")
                .antMatchers("/api/bankamat").hasAnyRole("MANAGER","DIRECTOR")
                .antMatchers("/api").hasRole("DIRECTOR")
                .anyRequest()
                .authenticated();
    }
}
