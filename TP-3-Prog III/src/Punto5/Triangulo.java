package Punto5;
import java.util.Scanner;

public class Triangulo extends Shape{

    protected double base;
    protected double altura;

    public Triangulo(double x, double y, double altura, double base) {
        super(x, y);
        this.base= base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public void dibujarFigura(){

        
        double resultado = (base*altura)/2;
        setArea(resultado);
        System.out.println("El triangulo fue dibujado y su area es de "+ resultado);

    }
    @Override
    public void modificarEscala(double escala){
        double alturanueva = altura * escala;
        double basenueva = base * escala;
        
        setAltura(alturanueva);
        setBase(basenueva);

        System.out.println("El triangulo tuvo una modificacion en su tamaño.");
    }
    @Override
    public void moverFigura( double x, double y){
        double nuevoX = x;
        double nuevoY = y;
    
        setX(nuevoX);
        setY(nuevoY);

        System.out.println("Cambio la posicion del triangulo a x="+nuevoX+", y="+nuevoY);
    }

    



    
    
    
}
