package co.edu.usco.pw.springboot_crud01.repository;

import co.edu.usco.pw.springboot_crud01.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
