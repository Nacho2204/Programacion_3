package TP2_HERENCIA.EjercicioEntregable10;

public class Vivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanios;

    public Vivienda(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios) {
        super(identificadorInmobiliario, metrosCuadrados, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanios = numBanios;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println(
                "Numero de habitaciones: " + getNumHabitaciones() + "\n" +
                "Numero de baños: " + getNumBanios());

    }
    
}
