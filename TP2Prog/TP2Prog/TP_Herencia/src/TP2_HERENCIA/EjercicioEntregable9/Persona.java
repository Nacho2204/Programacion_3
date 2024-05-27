package TP2_HERENCIA.EjercicioEntregable9;

public class Persona {
     protected String nombre;
     protected String apellido;
     protected double altura;
     protected long dni;
     protected String fechaIngreso;
     protected String domicilio;

    public Persona(String nombre, String apellido, double altura, long dni, String fechaIngreso, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public String imprimirRecibo(){
        return "Nombre: " + this.getNombre() + " "+ this.getApellido() +  "\nDNI: " + this.getDni() + "\nDomicilio: " + this.getDomicilio() + "\nFecha de ingreso: " + this.getFechaIngreso();
    }
}
    
