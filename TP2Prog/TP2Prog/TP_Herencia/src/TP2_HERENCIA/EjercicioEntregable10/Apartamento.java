package TP2_HERENCIA.EjercicioEntregable10;

public class Apartamento extends Vivienda {
   protected int valorAdministracion;

   public Apartamento(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios, int valorAdministracion) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, numHabitaciones, numBanios);
        this.valorAdministracion = valorAdministracion;
    }

public int getValorAdministracion() {
    return valorAdministracion;
}

public void setValorAdministracion(int valorAdministracion) {
    this.valorAdministracion = valorAdministracion;
}

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administracion: " + getValorAdministracion());
    }
    
}
