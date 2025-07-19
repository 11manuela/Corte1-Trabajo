package Dto;

public class HuespedDto {

    private String nombre;
    private String documento;
    private String correo;
    private String telefono;

    public HuespedDto(String nombre, String documento, String correo, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.correo = telefono;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
