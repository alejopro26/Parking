package co.edu.usco.pw.springboot_crud01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userName;
    private String plate;
    private int entryHour;
    private int exitHour;
    private String location;
    private String vehicleType;

    public Todo() {}

    public Todo(String userName, String plate, int entryHour, int exitHour, String location, String vehicleType) {
        this.userName = userName;
        this.plate = plate;
        this.entryHour = entryHour;
        this.exitHour = exitHour;
        this.location = location;
        this.vehicleType = vehicleType;
    }

    // Getters y setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPlate() { return plate; }
    public void setPlate(String plate) { this.plate = plate; }

    public int getEntryHour() { return entryHour; }
    public void setEntryHour(int entryHour) { this.entryHour = entryHour; }

    public int getExitHour() { return exitHour; }
    public void setExitHour(int exitHour) { this.exitHour = exitHour; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
}
