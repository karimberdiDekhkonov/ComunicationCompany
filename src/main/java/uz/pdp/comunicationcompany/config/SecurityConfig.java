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
                .antMatchers("/api/tariff",
                        "/api/ussdCodes",
                        "/api/simCard").hasAnyRole("USER","MANAGER","DIRECTOR")
                .antMatchers("/api").hasAnyRole("MANAGER","DIRECTOR")
                .anyRequest()
                .authenticated();
    }
}
