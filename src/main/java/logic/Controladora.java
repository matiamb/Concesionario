
package logic;

import persistence.ControladoraPersistencia;



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
    
}
