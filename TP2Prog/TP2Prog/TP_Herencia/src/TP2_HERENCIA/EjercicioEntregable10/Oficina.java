package TP2_HERENCIA.EjercicioEntregable10;

public class Oficina extends Inmueble{
    
     public Oficina(int identificadorInmobiliario, long metrosCuadrados, String direccion) {
        super(identificadorInmobiliario, metrosCuadrados, direccion);
    }

    public void imprimir() {
        super.imprimir();
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 2400000;
        long precio = metrosCuadrados * valorMetroCuadrado;

        imprimir();
        System.out.println("Precio del inmueble: " + precio);        
    }
}
