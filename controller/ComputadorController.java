package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Computador;

public class ComputadorController {

    private List<Computador> computadores;
    private int serial;

    public ComputadorController() {
        this.computadores = new ArrayList<>();
        this.serial = 1;
    }
    
    public Boolean agregarComputador(String nombre, String marca, int precio, String cablePoder, String provedor){

        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        if (precio <= 0){
            return false;
        }

        Computador computadorNuevo = new Computador(nombre, marca, precio, serial, cablePoder, provedor);
        Boolean agregado = computadores.add(computadorNuevo);

        if (agregado) serial++;
        return agregado;
    }
}
