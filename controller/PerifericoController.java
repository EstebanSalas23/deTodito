package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Periferico;

public class PerifericoController {
    
    private List<Periferico> perifericos;
    private int serial;

    public PerifericoController(){
        this.perifericos = new ArrayList<>();
        this.serial = 1;
    }

    public Boolean agregarPeriferico(String nombre, String marca, int precio, String subCategorias){

        if (nombre == null || nombre.trim().isEmpty()){
            return false;
        }
        if (precio <= 0){
            return false;   
        }

        Periferico perifericoNuevo = new Periferico(nombre, marca, precio, serial, subCategorias);
        Boolean agregado = perifericos.add(perifericoNuevo);

        if (agregado) serial++;
        return agregado;
    }
}
