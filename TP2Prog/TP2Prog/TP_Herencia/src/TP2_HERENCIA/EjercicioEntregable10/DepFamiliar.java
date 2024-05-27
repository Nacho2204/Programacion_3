package TP2_HERENCIA.EjercicioEntregable10;

public class DepFamiliar extends Apartamento {
    


    public DepFamiliar(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios, int valorAdministracion) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, numHabitaciones < 1 ? 1 : numHabitaciones, numBanios, valorAdministracion);
}

    public void imprimir() {
        super.imprimir();
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 1800000;
        long precio = metrosCuadrados * valorMetroCuadrado;

        
        imprimir();
        System.out.println("Precio del inmueble: " + precio);
    }
}
