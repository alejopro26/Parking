package co.edu.usco.pw.springboot_crud01.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Autenticación", description = "Verificación de credenciales y sesión actual")
public class AuthController {

    @GetMapping("/me")
    @Operation(summary = "Ver usuario autenticado", description = "Devuelve la información del usuario que ha iniciado sesión actualmente.")
    public Authentication getUsuarioActual(Authentication authentication) {
        return authentication;
    }
}
