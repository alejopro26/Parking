package co.edu.usco.pw.springboot_crud01.repository;

import co.edu.usco.pw.springboot_crud01.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
