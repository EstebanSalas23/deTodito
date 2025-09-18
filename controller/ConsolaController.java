package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Consola;

public class ConsolaController {
    
    private List<Consola> consolas;
    private int serial;

    public ConsolaController() {
        this.consolas = new ArrayList<>();
        this.serial = 1;
    }

    public Boolean agregarConsola(String nombre, String marca, int precio, String cablePoder, String cableAux){

        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        if (precio <= 0){
            return false;
        }
        
        Consola consolaNuevo = new Consola(nombre, marca, precio, serial, cablePoder, cableAux);
        Boolean agregado = consolas.add(consolaNuevo);
        
        if (agregado) serial++;
        return agregado;
    }
}
