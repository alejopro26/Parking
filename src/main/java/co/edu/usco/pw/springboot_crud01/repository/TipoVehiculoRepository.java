package co.edu.usco.pw.springboot_crud01.repository;

import co.edu.usco.pw.springboot_crud01.model.TipoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Long> {
    // Puedes agregar métodos personalizados si los necesitas,
    // por ejemplo:
    // Optional<TipoVehiculo> findByNombre(String nombre);
}
