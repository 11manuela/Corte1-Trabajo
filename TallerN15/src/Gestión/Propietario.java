package Gestión;

public class Propietario {

    private String nombre;
    private String documento;

    public Propietario(String nombre, String documento) {
        setNombre(nombre);
        setDocumento(documento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
