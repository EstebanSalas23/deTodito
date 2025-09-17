
package Electronicos;

public abstract class consola extends padreElec{
    
    private String cablePoder, cableAux;

    public consola(String nombre, String marca, String precio, String serial, String cablePoder, String cableAux) {
        super(nombre, marca, precio, serial);
        this.cablePoder = cablePoder;
        this.cableAux = cableAux;
    }

    public String getCablePoder() {
        return cablePoder;
    }

    public void setCablePoder(String cablePoder) {
        this.cablePoder = cablePoder;
    }

    public String getCableAux() {
        return cableAux;
    }

    public void setCableAux(String cableAux) {
        this.cableAux = cableAux;
    }

    @Override
    public String toString() {
        return "consola{" + "cablePoder=" + cablePoder + ", cableAux=" + cableAux + '}';
    }
    
    
}
