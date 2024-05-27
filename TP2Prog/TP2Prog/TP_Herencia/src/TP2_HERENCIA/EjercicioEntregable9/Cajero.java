package TP2_HERENCIA.EjercicioEntregable9;

public class Cajero extends Persona {
    protected int sueldoBasico;
     
    public Cajero(String nombre, String apellido, double altura, long dni, String fechaIngreso, String domicilio, int sueldoBasico) {
        super(nombre, apellido, altura, dni, fechaIngreso, domicilio);
        this.sueldoBasico = sueldoBasico;
    }

    public String imprimirRecibo(){
        return "Nombre: " + this.getNombre() + " "+ this.getApellido() +  "\nDNI: " + this.getDni() + "\nDomicilio: " + this.getDomicilio() + "\nFecha de ingreso: " + this.getFechaIngreso() + "\nCategoria: Cajero" + "\nSueldo Basico: " + this.getSueldoBasico() + "\nTotal a cobrar: " + this.getSueldoBasico();
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
}
