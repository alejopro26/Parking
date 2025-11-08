package co.edu.usco.pw.springboot_crud01.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.*;
import io.swagger.v3.oas.models.security.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiDoc() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Parqueadero USCO")
                        .description("Documentación de los servicios REST del sistema de gestión de parqueadero con roles y autenticación.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Alejandro Puentes Salazar")
                                .email("alejandro.puentes@usco.edu.co")
                                .url("https://www.usco.edu.co")
                        )
                )
                .components(new Components()
                        .addSecuritySchemes("basicAuth",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")))
                .addSecurityItem(new SecurityRequirement().addList("basicAuth"));
    }
}


