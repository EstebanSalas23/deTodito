
package modelo;

public class portatil extends consola{
    
    private String bateria, pantalla;

    public portatil(String nombre, String marca, String precio, String serial, String cablePoder, String cableAux, String bateria, String pantalla) {
        super(nombre, marca, precio, serial, cablePoder, cableAux);
        this.bateria = bateria;
        this.pantalla = pantalla;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public String toString() {
        return "portatil{" + "bateria=" + bateria + ", pantalla=" + pantalla + '}';
    }
    
    
}
