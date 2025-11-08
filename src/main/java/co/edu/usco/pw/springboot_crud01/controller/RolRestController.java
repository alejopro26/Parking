package co.edu.usco.pw.springboot_crud01.controller;

import co.edu.usco.pw.springboot_crud01.model.Rol;
import co.edu.usco.pw.springboot_crud01.repository.RolRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@Tag(name = "Roles", description = "Operaciones CRUD para la administración de roles de usuario")
public class RolRestController {

    @Autowired
    private RolRepository rolRepository;

    @GetMapping
    @Operation(summary = "Listar roles", description = "Devuelve una lista con todos los roles disponibles en el sistema.")
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Crear rol", description = "Agrega un nuevo rol a la base de datos.")
    public Rol crearRol(@RequestBody Rol rol) {
        return rolRepository.save(rol);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar rol", description = "Elimina un rol específico por ID.")
    public void eliminarRol(@PathVariable Long id) {
        rolRepository.deleteById(id);
    }
}
