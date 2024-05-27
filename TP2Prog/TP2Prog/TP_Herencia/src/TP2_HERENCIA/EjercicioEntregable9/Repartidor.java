package TP2_HERENCIA.EjercicioEntregable9;

public class Repartidor extends Cajero {
   protected int cantidadRepartos;

    public Repartidor(String nombre, String apellido, double altura, long dni, String fechaIngreso, String domicilio,
            int sueldoBasico, int cantidadRepartos) {
        super(nombre, apellido, altura, dni, fechaIngreso, domicilio, sueldoBasico);
        this.cantidadRepartos = cantidadRepartos;
    }

    public int getCantidadRepartos() {
        return cantidadRepartos;
    }

    public void setCantidadRepartos(int cantidadRepartos) {
        this.cantidadRepartos = cantidadRepartos;
    }

    public String imprimirRecibo(){
        int saldo=getSueldoBasico();
        int cantidadRepartos=getCantidadRepartos();
        if(cantidadRepartos>=0){
            int dineroxRepartos=cantidadRepartos*500;
            saldo=saldo+dineroxRepartos;
            return "Nombre: " + this.getNombre() + " "+ this.getApellido() +  "\nDNI: " + this.getDni() + "\nDomicilio: " + this.getDomicilio() + "\nFecha de ingreso: " + this.getFechaIngreso() + "\nCategoria: Repartidor" + "\nSueldo Basico: " + this.getSueldoBasico() + "\nDinero por entregas: "+ dineroxRepartos + "\nTotal a cobrar: " + saldo;
        }
        else{
            return null;
        }
    }

}
