import java.util.Scanner;

public class Punto8
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un carácter: ");
        char caracter = scanner.next().charAt(0);

        if (Character.isUpperCase(caracter)) {
            System.out.println("El carácter ingresado es una letra mayúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra mayúscula.");
        }

        scanner.close();
    }
}
