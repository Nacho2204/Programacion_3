package TP2_HERENCIA.EjercicioEntregable10;

public class Inmueble {
   protected int identificadorInmobiliario;
   protected long metrosCuadrados;
   protected String direccion;

    public Inmueble(int identificadorInmobiliario, long metrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
    }

    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("\n" +
                "Identificador: " + identificadorInmobiliario + "\n" +
                "Metros cuadrados: " + metrosCuadrados + "\n" +
                "Dirección: " + direccion);
    }
}
