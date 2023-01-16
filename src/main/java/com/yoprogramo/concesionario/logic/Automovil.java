
package com.yoprogramo.concesionario.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE )
    private int id;
    private String modelo;
    private String marca;
    private String motor;
    private String color;
    private String patente;
    private String cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int id, String modelo, String marca, String motor, String color, String patente, String cantidadPuertas) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public String getPatente() {
        return patente;
    }

    public String getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCantidadPuertas(String cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
}
