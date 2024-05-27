package Punto5;
import java.util.Scanner;



public class Rectangulo extends Shape{
    
    private double lado1, lado2;

    public Rectangulo(double x, double y, double lado1, double lado2) {
        super(x, y);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    Scanner scanner = new Scanner(System.in);
    @Override
    public void dibujarFigura(){
        if (lado1 == lado2) {
            System.out.println("Esta figura tiene las medidas de sus lados iguales y asi no puede ser un rectangulo, ingrese las nuevas medidas por favor");
        
        while (lado1!=lado2) {
            System.out.println("Ingrese el lado 1: ");
            double lado1nuevo = scanner.nextDouble();
            setLado1(lado1nuevo);
            System.out.println("Ingrese el lado 2: ");
            double lado2nuevo = scanner.nextDouble();
            setLado2(lado2nuevo);
        }
    }
    else{
        double resultado = lado1 * lado2;
        setArea(resultado);
        System.out.println("El rectangulo fue dibujado y su area es de "+ resultado);
    }
    }
    @Override
    public void modificarEscala(double escala){
        double lado1nuevo = lado1 * escala;
        double lado2nuevo = lado2 * escala;
        setLado1(lado1nuevo);
        setLado2(lado2nuevo);
        System.out.println("El rectangulo tuvo una modificacion en su tamaño.");
    }
    @Override
    public void moverFigura( double x, double y){
        double nuevoX = x;
        double nuevoY = y;
    
        setX(nuevoX);
        setY(nuevoY);

        System.out.println("Cambio la posicion del rectangulo a x="+nuevoX+", y="+nuevoY);
    }

}


