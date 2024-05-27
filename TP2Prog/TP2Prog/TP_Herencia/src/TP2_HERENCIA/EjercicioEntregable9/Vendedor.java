package TP2_HERENCIA.EjercicioEntregable9;

public class Vendedor extends Cajero {
    protected int ventasMensuales;

    public Vendedor(String nombre, String apellido, double altura, long dni, String fechaIngreso, String domicilio,
         int sueldoBasico, int ventasMensuales) {
        super(nombre, apellido, altura, dni, fechaIngreso, domicilio, sueldoBasico);
        this.ventasMensuales = ventasMensuales;
    }

    public int getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(int ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public String imprimirRecibo(){
        int ventasMensuales=getVentasMensuales();
        int saldo=getSueldoBasico();
        if(ventasMensuales>=0){
            int ventasMensualesConComision=ventasMensuales/2;
            saldo=saldo+ventasMensualesConComision;
            return "Nombre: " + this.getNombre() + " "+ this.getApellido() +  "\nDNI: " + this.getDni() + "\nDomicilio: " + this.getDomicilio() + "\nFecha de ingreso: " + this.getFechaIngreso() + "\nCategoria: Vendedor" + "\nSueldo Basico: " + this.getSueldoBasico() + "\nVentas Mensuales: "+ ventasMensualesConComision + "\nTotal a cobrar: " + saldo;
        }
        else{
            return null;
        }
    }
}
