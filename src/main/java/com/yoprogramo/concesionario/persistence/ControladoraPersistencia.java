
package com.yoprogramo.concesionario.persistence;

import com.yoprogramo.concesionario.logic.Automovil;


public class ControladoraPersistencia {
    
    AutomovilJpaController autojpa = new AutomovilJpaController();
    
    public void guardar(Automovil auto) {
        
        autojpa.create(auto);
    }
    
}
