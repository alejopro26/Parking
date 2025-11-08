package co.edu.usco.pw.springboot_crud01.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_vehiculo")
public class TipoVehiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoVehiculo;

    @Column(nullable = false, unique = true, length = 30)
    private String nombre;

    public TipoVehiculo() {}

    public TipoVehiculo(Long idTipoVehiculo, String nombre) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getIdTipoVehiculo() { return idTipoVehiculo; }
    public void setIdTipoVehiculo(Long idTipoVehiculo) { this.idTipoVehiculo = idTipoVehiculo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "TipoVehiculo [idTipoVehiculo=" + idTipoVehiculo + ", nombre=" + nombre + "]";
    }
}
