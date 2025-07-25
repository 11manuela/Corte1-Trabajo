package Clinica;


public class Veterinario {

    private String nombre;
    private String especialidad;

    public Veterinario(String nombre, String especialidad) {
       /* this.nombre = nombre;
        this.especialidad = especialidad;*/
        //Refactor: validación se setters
        setNombre(nombre);
        setEspecialidad(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

  /*  public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del veterinario no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    /*public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }*/

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.especialidad = especialidad;
    }
    //Muestra los datos
    public void mostrarPerfil() {
        System.out.println("Veterinario: " + nombre + " | Especialidad: " + especialidad);

    }
}
