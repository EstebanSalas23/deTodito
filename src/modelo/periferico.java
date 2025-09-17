
package modelo;

public abstract class periferico extends padreElec{
    
    protected String subCategorias;

    public periferico(String nombre, String marca, String precio, String serial, String subCategorias) {
        super(nombre, marca, precio, serial);
        this.subCategorias = subCategorias;
    }

    public String getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(String subCategorias) {
        this.subCategorias = subCategorias;
    }

    @Override
    public String toString() {
        return "periferico{" + "subCategorias=" + subCategorias + '}';
    }
    
    
}
