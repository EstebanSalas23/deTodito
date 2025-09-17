
package modelo;

public abstract class padreElec {
    
    protected String nombre, marca, precio, serial;

    public padreElec(String nombre, String marca, String precio, String serial) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.serial = serial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "padreElec{" + "nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + ", serial=" + serial + '}';
    }
    
    
    
    
}
//modelo, controlador=las clases, vista 