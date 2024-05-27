package Punto5;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeList extends Shape{

    protected List<Shape> listaFiguras = new ArrayList <>();

    public ShapeList() {
        
        this.listaFiguras = new ArrayList<>();
    }

    public ShapeList(List<Shape> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public List<Shape> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(List<Shape> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    @Override
    public void agregarFigura(Shape figura){

        Shape fig = figura;
        listaFiguras.addLast(fig);

        System.out.println("La figura fue agregada.");

    }
    @Override
    public void insertarFigura(Shape figura, int posicion){

        Shape fig = figura;
        int pos = posicion;

        listaFiguras.add(pos, fig);

        System.out.println("La figura "+fig+" fue insertada en la posicion "+pos);
    }
    @Override
    public void mostrarFiguras(){
        int cantidad = 0;
        for(int i = 0; i<listaFiguras.size();i++){

            cantidad = cantidad+1;

        }
        System.out.println("Hay "+ cantidad + " figuras.");
    }
    @Override
    public void eliminarFigura (int posicion){

        int pos = posicion;

        listaFiguras.remove(pos);

        System.out.println("La figura fue eliminada.");
    }
    
    Scanner scanner = new Scanner(System.in);
    @Override
    public void figuraCoordenadas(int x, int y) {

    boolean figuraEncontrada = false;

    for (Shape figura : listaFiguras) {
        if (figura.getX() == x && figura.getY() == y) {
            figuraEncontrada = true;

            System.out.println("Se encontró una figura, indique por cuánto la quiere escalar: ");
            double escala = scanner.nextDouble();
            System.out.println("Indique el nuevo delta x: ");
            double deltax = scanner.nextDouble();
            System.out.println("Indique el nuevo delta y: ");
            double deltay = scanner.nextDouble();

            System.out.println("La figura fue encontrada.");
            figura.modificarEscala(escala);
            figura.moverFigura(deltax, deltay);

            
            break;
        }
    }

    if (!figuraEncontrada) {
        System.out.println("La figura no fue encontrada.");
    }

    
    scanner.close();
}

}