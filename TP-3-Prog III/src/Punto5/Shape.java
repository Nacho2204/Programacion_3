package Punto5;

public abstract class Shape {

    protected double x;
    protected double y;
    protected double area;

    public Shape() {
    }


    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }


    

    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(double y) {
        this.y = y;
    }


    public double getArea() {
        return area;
    }


    public void setArea(double area) {
        this.area = area;
    }
    
    public void dibujarFigura(){}

    public void modificarEscala(double escala){}

    public void moverFigura(double x, double y){}

    public void agregarFigura(Shape figura){}

    public void insertarFigura(Shape figura, int posicion){}

    public void mostrarFiguras(){}

    public void eliminarFigura( int posicion){}


    public void figuraCoordenadas(int x, int y) {
    }

}
