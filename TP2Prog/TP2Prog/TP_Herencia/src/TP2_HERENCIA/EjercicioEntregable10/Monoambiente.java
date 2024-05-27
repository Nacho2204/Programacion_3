package TP2_HERENCIA.EjercicioEntregable10;

public class Monoambiente extends Apartamento {
    


    public Monoambiente(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios, int valorAdministracion) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, 0, numBanios, valorAdministracion);
}


    public void imprimir() {
        super.imprimir();
       
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 1000000;
        long precio = metrosCuadrados * valorMetroCuadrado;

        
        imprimir();
        System.out.println("Precio del inmueble: " + precio);
    }
}
