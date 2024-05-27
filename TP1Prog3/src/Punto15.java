import java.util.Scanner;
public class Punto15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num;
        System.out.println("Ingrese el numero que quiera: ");
        num= scanner.nextInt();
        
        /*Primer metodo     
        while (num!=0) {
            if (num>0) {
                System.out.println(num + " es positivo.");
            }
            else{
                System.out.println(num + " es negativo.");
            }
            if (num%2==0) {
                System.out.println(num + " es par.");
            }
            else{
                System.out.println(num + " es impar.");
            }
            System.out.println("Ingrese otro numero, cuando quiera salir ingrese el 0.");
            num= scanner.nextInt();
        }*/

        /*Segundo metodo 
        do{
            if (num>0) {
                System.out.println(num + " es positivo.");
            }
            else{
                System.out.println(num + " es negativo.");
            }
            if (num%2==0) {
                System.out.println(num + " es par.");
            }
            else{
                System.out.println(num + " es impar.");
            }
            System.out.println("Ingrese otro numero, cuando quiera salir ingrese el 0.");
            num= scanner.nextInt();
        }while(num!=0);*/
        
        /*Tercer metodo  
        char opcion;
        do {
            System.out.println("Ingrese un número: ");
            num = scanner.nextInt();


            if (num > 0) {
                System.out.println(num + " es positivo.");
            } else {
                System.out.println(num + " es negativo.");
            }

            if (num % 2 == 0) {
                System.out.println(num + " es par.");
            } else {
                System.out.println(num + " es impar.");
            }

            scanner.nextLine(); 

            System.out.println("¿Desea introducir más números? (S/N):");
            opcion = scanner.nextLine().charAt(0);

            
        } while (opcion == 's' || opcion == 'S');

        scanner.close();
    }*/
}
}
