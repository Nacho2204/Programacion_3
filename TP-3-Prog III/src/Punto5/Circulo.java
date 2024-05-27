package Punto5;

public class Circulo extends Shape{
    
protected double radio;

public Circulo(double x, double y, double radio) {
    super(x, y);
    this.radio = radio;
}

public double getRadio() {
    return radio;
}

public void setRadio(double radio) {
    this.radio = radio;
}
@Override
public void dibujarFigura(){

    double pi= 3.14;
    double resultado = pi *radio*radio;
    setArea(resultado);
    System.out.println("El circulo fue dibujado y su area es de "+ resultado);
    
}
@Override
public void modificarEscala(double escala){
    double radionuevo = radio * escala;
    
    setRadio(radionuevo);
   
    System.out.println("El circulo tuvo una modificacion en su tamaño.");
}
@Override
public void moverFigura( double x, double y){
    double nuevoX = x;
    double nuevoY = y;

    setX(nuevoX);
    setY(nuevoY);

    System.out.println("Cambio la posicion del circulo a x="+nuevoX+", y="+nuevoY);
}



}
