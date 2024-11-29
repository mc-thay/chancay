package com.example.chancay.model;
import jakarta.persistence.*;
@Entity
@Table(name = "embarcacion")
public class Embarcacion {

    //llave primaria incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //columnan nombre
    @Column(length = 50, nullable = false)
    private String nombre;

    //columnan capacidad
    @Column(nullable = false)
    private Double capacidad;

    //columnan nombre
    @Column(length = 50, nullable = false)
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
