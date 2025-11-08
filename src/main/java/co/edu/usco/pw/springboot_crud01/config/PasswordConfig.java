package co.edu.usco.pw.springboot_crud01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        // 🔐 Cifrado seguro (no uses NoOp en producción)
        return new BCryptPasswordEncoder();
    }
}
