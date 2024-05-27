package TP2_HERENCIA.EjercicioEntregable10;

public class CasaIndependiente extends Casa{

    public CasaIndependiente(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, numHabitaciones, numBanios);
    }
    

    public void imprimir() {
        super.imprimir();      
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 2000000;
        long precio = metrosCuadrados * valorMetroCuadrado;

        imprimir();
        System.out.println("Precio del inmueble: " + precio);
    }
}
