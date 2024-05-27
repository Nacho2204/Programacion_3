package Punto4;



public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana();

        Ventana.TextoVentana textoVentana = ventana.new TextoVentana("arial", 12, "negro");

        Ventana.Boton boton1 = ventana.new Boton(textoVentana, "url_logo_4", 80, 10,"Añadir nuevo comentario.");
        Ventana.Boton boton2 = ventana.new Boton(textoVentana, "url_logo_1", 20, 10,"Anterior");
        Ventana.Boton boton3 = ventana.new Boton(textoVentana, "url_logo_2", 20, 10,"Siguiente");
        Ventana.Boton boton4 = ventana.new Boton(textoVentana, "url_logo_3", 20, 10,"Cierra");
        Ventana.Boton boton5 = ventana.new Boton(textoVentana, "url_logo_5", 20, 10,"Ayuda...");
        
        Ventana.ScrollBar scrollBarVertical = ventana.new ScrollBar(100, 0, "Vertical");
        Ventana.ScrollBar scrollBarHorizonta = ventana.new ScrollBar(100, 0, "Horizontal");

        Ventana.CajaTexto cajaTexto1= ventana.new CajaTexto(80, 35);

        Ventana ventanaOriginal = new Ventana(boton1, boton2, boton3, boton4, boton5, scrollBarVertical, scrollBarHorizonta, cajaTexto1, textoVentana);

    }
}
