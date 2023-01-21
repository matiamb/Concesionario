
package com.yoprogramo.concesionario.persistence;

import com.yoprogramo.concesionario.logic.Automovil;
import java.util.List;


public class ControladoraPersistencia {
    
    AutomovilJpaController autojpa = new AutomovilJpaController();
    
    public void guardar(Automovil auto) {
        
        autojpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autojpa.findAutomovilEntities();
    }
    
}
