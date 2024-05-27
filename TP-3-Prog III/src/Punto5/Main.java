package Punto5;

public class Main {
    public static void main(String[] args) {
        
    
    Circulo circulo1 = new Circulo(14, 25, 14);

    Triangulo triangulo1 = new Triangulo(12, 4, 32, 45);

    Rectangulo rectangulo1 = new Rectangulo(5, 8, 14, 10);

    ShapeList listaFiguras = new ShapeList();

   circulo1.dibujarFigura();

   triangulo1.modificarEscala(5);

   rectangulo1.moverFigura(64, 19);

   listaFiguras.agregarFigura(circulo1);

   listaFiguras.agregarFigura(triangulo1);

   listaFiguras.agregarFigura(rectangulo1);
   
   listaFiguras.figuraCoordenadas(12, 4);
   
   listaFiguras.figuraCoordenadas(6, 87);

   listaFiguras.eliminarFigura(2);

   listaFiguras.mostrarFiguras();

}
}
