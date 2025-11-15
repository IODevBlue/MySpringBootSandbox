package iodevblue.sandbox.springboot.myspringbootsandbox.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RestController;


@Configuration
// @Profile("dev")
public class SecurityConfig {

//      @Bean
//     public UserDetailsService userDetailsService() {
//         var user = User.withUsername("admin")
//                 .password("admin")
//                 .roles("USER")
//                 .build();

//         return new InMemoryUserDetailsManager(user);
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         // Not for production, but fine for testing
//         return NoOpPasswordEncoder.getInstance();
//     }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())   // disable CSRF for testing
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()   // allow everything
            )
            .httpBasic(Customizer.withDefaults())
            .formLogin(form -> form.disable()); // disable login page

        return http.build();
    }
}

