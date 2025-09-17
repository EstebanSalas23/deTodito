
package modelo;

public abstract class computador extends padreElec{
    
    protected String cablePoder, provedor;

    public computador(String nombre, String marca, String precio, String serial, String cablePoder, String provedor) {
        super(nombre, marca, precio, serial);
        this.cablePoder = cablePoder;
        this.provedor = provedor;
    }

    public String getCablePoder() {
        return cablePoder;
    }

    public void setCablePoder(String cablePoder) {
        this.cablePoder = cablePoder;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    @Override
    public String toString() {
        return "computador{" + "cablePoder=" + cablePoder + ", provedor=" + provedor + '}';
    }
    
    
    
    
}
