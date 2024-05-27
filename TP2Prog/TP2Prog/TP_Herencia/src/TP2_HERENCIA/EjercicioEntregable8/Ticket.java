package TP2_HERENCIA.EjercicioEntregable8;

public class Ticket {
    double montoCuotas;
    double montoTotal;
    String nombre;
    String apellido;

    public Ticket(double montoCuotas, double montoTotal, String nombre, String apellido) {
        this.montoCuotas = montoCuotas;
        this.montoTotal = montoTotal;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString() {
        return "Ticket:\n" +
               "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Monto total a pagar: $" + montoTotal + "\n" +
               "Monto por cuota: $" + montoCuotas;         
    }

    public double getMontoCuotas() {
        return montoCuotas;
    }

    public void setMontoCuotas(double montoCuotas) {
        this.montoCuotas = montoCuotas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
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

    

    

}
