package TP2_HERENCIA.EjercicioEntregable10;

public class LocalesComerciales extends Inmueble{
    protected String localizacion;
    protected String centroComercial;

    public LocalesComerciales(int identificadorInmobiliario, long metrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(identificadorInmobiliario, metrosCuadrados, direccion);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Localizacion: " + getLocalizacion() + "\n" +
                "Centro comercial: " + getCentroComercial());
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 3000000;
        long precio = metrosCuadrados * valorMetroCuadrado;

        
        imprimir();
        System.out.println("Precio del inmueble: " + precio);
    }
    
}
