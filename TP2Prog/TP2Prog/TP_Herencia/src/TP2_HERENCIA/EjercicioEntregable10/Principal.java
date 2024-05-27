package TP2_HERENCIA.EjercicioEntregable10;

public class Principal {
    public static void main(String[] args) {
        
        CasaConjCerrado casaConjCerrado = new CasaConjCerrado(14329, 50, "Vieytes 298", 5, 2, 15000, "Piscina");
        casaConjCerrado.calcularPrecio();
        
        LocalesComerciales LocalComercial = new LocalesComerciales(12345, 30, "Sarmiento 4000","Interno","Bahia Plaza Shopping");
        LocalComercial.calcularPrecio();
    }


}
