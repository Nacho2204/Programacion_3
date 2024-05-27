package TP2_HERENCIA.EjercicioEntregable10;

public class CasaConjCerrado extends Casa {
    protected int valorAdministracion;
    protected String areasComunes;

    public CasaConjCerrado(int identificadorInmobiliario, long metrosCuadrados, String direccion, int numHabitaciones, int numBanios, int valorAdministracion, String areasComunes) {
        super(identificadorInmobiliario, metrosCuadrados, direccion, numHabitaciones, numBanios);
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;


    }

    public int getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(int valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public String isAreasComunes() {
        return areasComunes;
    }

    public void setAreasComunes(String areasComunes) {
        this.areasComunes = areasComunes;
    }
    

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor administracion: " + getValorAdministracion() + "\n" +
                "Areas comunes: " + isAreasComunes());
    }

    public void calcularPrecio(){
        long metrosCuadrados = getMetrosCuadrados();
        long valorMetroCuadrado = 2500000;
            long precio = metrosCuadrados * valorMetroCuadrado;

     
        imprimir();
        System.out.println("Precio del inmueble: " + precio);
        
    }
}
