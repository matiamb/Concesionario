
package com.yoprogramo.concesionario.persistence;

import com.yoprogramo.concesionario.logic.Automovil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    AutomovilJpaController autojpa = new AutomovilJpaController();
    
    public void guardar(Automovil auto) {
        
        autojpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autojpa.findAutomovilEntities();
    }

    public void borrarAuto(int autoId) {
        try {
            autojpa.destroy(autoId);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
