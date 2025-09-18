package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Portatil;

public class PortatilController {
    
    private List<Portatil> portatiles;
    private int serial;

    public PortatilController() {
        this.portatiles = new ArrayList<>();
        this.serial = 1;
    }

    public Boolean agregarConsola(String nombre, String marca, int precio, String cablePoder, String cableAux, String bateria, String pantalla){

        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        if (precio <= 0){
            return false;
        }
        
        Portatil portatilNuevo = new Portatil(nombre, marca, precio, serial, cablePoder, cableAux, bateria, pantalla);
        Boolean agregado = portatiles.add(portatilNuevo);
        
        if (agregado) serial++;
        return agregado;
    }
}
