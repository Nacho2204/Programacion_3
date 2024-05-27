import java.util.Scanner;

public class Punto9y10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el lado a: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el lado b: ");
        int b = scanner.nextInt();
        System.out.print("Ingresa el lado c: ");
        int c = scanner.nextInt();

        if (Triangulo(a, b, c)) {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " pueden formar un triángulo.");
            tipoTriangulo(a, b, c);
        } else {
            System.out.println("Los lados " + a + ", " + b + ", " + c + " no pueden formar un triángulo.");
        }

        scanner.close();
    }

    public static boolean Triangulo(int a,int b,int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void tipoTriangulo(int a,int b, int c){
        if (a!=b && b!=c && a!=c){
            System.out.println("El triangulo es escaleno");
        }
        else if (a==b && b==c && a==c){
            System.out.println("El triangulo es equilatero");
        }
        else {
            System.out.println("El triangulo es isosceles");
        }
    }
}
