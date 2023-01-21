
package com.yoprogramo.concesionario.logic;

import com.yoprogramo.concesionario.persistence.ControladoraPersistencia;
import java.util.List;



public class Controladora {
    
    ControladoraPersistencia controlpersis = new ControladoraPersistencia();

    public void guardar(String marca, String modelo, String motor, String color, String patente, String puertas) {
        
        Automovil auto = new Automovil();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        
        controlpersis.guardar(auto);
    }
    
    public List<Automovil> traerAutos(){
       return controlpersis.traerAutos();
    }

    public void borrarAuto(int autoId) {
        controlpersis.borrarAuto(autoId);
    }

    public void modificarAuto(Automovil auto, String marca, String modelo, String motor, String color, String patente, String puertas) {
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        
        controlpersis.modificarAuto(auto);
    }

    public Automovil traerAuto(int autoId) {
        return controlpersis.traerAuto(autoId);
    }
    
}
