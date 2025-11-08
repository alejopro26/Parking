package co.edu.usco.pw.springboot_crud01.controller;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;
import co.edu.usco.pw.springboot_crud01.repository.VehiculoRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
@Tag(name = "Vehículos", description = "Operaciones CRUD para la gestión de vehículos del parqueadero")
public class VehiculoRestController {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping
    @Operation(summary = "Listar todos los vehículos", description = "Devuelve una lista con todos los vehículos registrados.")
    public List<Vehiculo> listar() {
        return vehiculoRepository.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener vehículo por ID", description = "Devuelve los datos de un vehículo según su ID.")
    public Vehiculo obtenerPorId(@PathVariable Long id) {
        return vehiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
    }

    @PostMapping
    @Operation(summary = "Registrar nuevo vehículo", description = "Crea un nuevo registro de vehículo en el sistema.")
    public Vehiculo crear(@RequestBody Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar vehículo", description = "Actualiza los datos de un vehículo existente.")
    public Vehiculo actualizar(@PathVariable Long id, @RequestBody Vehiculo vehiculoActualizado) {
        Vehiculo v = vehiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehículo no encontrado"));
        v.setPlaca(vehiculoActualizado.getPlaca());
        v.setHoraEntrada(vehiculoActualizado.getHoraEntrada());
        v.setHoraSalida(vehiculoActualizado.getHoraSalida());
        v.setUbicacion(vehiculoActualizado.getUbicacion());
        v.setTipoVehiculo(vehiculoActualizado.getTipoVehiculo());
        return vehiculoRepository.save(v);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar vehículo", description = "Elimina un vehículo de la base de datos por su ID.")
    public void eliminar(@PathVariable Long id) {
        vehiculoRepository.deleteById(id);
    }
}
