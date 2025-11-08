package co.edu.usco.pw.springboot_crud01.repository;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> { }
