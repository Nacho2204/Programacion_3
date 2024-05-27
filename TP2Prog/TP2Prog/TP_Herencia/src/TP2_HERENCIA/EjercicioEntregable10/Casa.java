package TP2_HERENCIA.EjercicioEntregable10;

public class Casa extends Vivienda{
    
    

    public Casa(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, numHabitaciones, numBanios);
    }
    

    public void imprimir() {
        super.imprimir();
        
    }

    public void calcularPrecio(){
        double metrosCuadrados = getMetrosCuadrados();
        int valorMetroCuadrado = 1500000;
        double precio = metrosCuadrados * valorMetroCuadrado;

        
        imprimir();
        System.out.println("Precio del inmueble: " + precio);
        
    }
}
