package TP2_HERENCIA.EjercicioEntregable9;

public class Administrativo extends Cajero {
   protected String tipopJornada;

    public Administrativo(String nombre, String apellido, double altura, long dni, String fechaIngreso,
            String domicilio, int sueldoBasico, String tipopJornada) {
        super(nombre, apellido, altura, dni, fechaIngreso, domicilio, sueldoBasico);
        this.tipopJornada = tipopJornada;
    }

    
    public String getTipopJornada() {
        return tipopJornada;
    }
    
    public void setTipopJornada(String tipopJornada) {
        this.tipopJornada = tipopJornada;
    }
    
    public String imprimirRecibo(){
        int saldo=getSueldoBasico();
        if(this.getTipopJornada() == "Completa" || this.getTipopJornada() == "completa"){
           saldo=650000; 
        }
        else if(this.getTipopJornada()=="Media" || this.getTipopJornada()=="media"){
            saldo=350000;
        }
        else{
            System.out.println("Tipo de jornada no valida, los tipos son completa o media");
            return null;
        }
        return "Nombre: " + this.getNombre() + " "+ this.getApellido() +  "\nDNI: " + this.getDni() + "\nDomicilio: " + this.getDomicilio() + "\nFecha de ingreso: " + this.getFechaIngreso() + "\nCategoria: Administrativo" + "\nSueldo Basico: " + this.getSueldoBasico() + "\nTipo de jornada: "+ this.getTipopJornada() + "\nTotal a cobrar: " + saldo;
    }
}
