import java.util.Scanner;
public class Punto14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int A,B;
        System.out.println("Ingrese el valor de A: ");
        A= scanner.nextInt();
        System.out.println("Ingrese el valor de B: ");
        B= scanner.nextInt();

        if (A>=B) {
            
            do{
                System.out.println("A debe ser menor a B, ingrese los valores de nuevo.");
                System.out.println("Nuevo valor de A: ");
                A=scanner.nextInt();
                System.out.println("Nuevo valor de B: ");
                B=scanner.nextInt();
            }while(A>B);

        }
        System.out.println("Los numeros pares entre A y B son:");
        for(int i=A;i<=B;i++){
            int num=i;
            if (num%2==0) {

                    System.out.println(num);
            }
        }
        
        scanner.close();


        
    }
}
