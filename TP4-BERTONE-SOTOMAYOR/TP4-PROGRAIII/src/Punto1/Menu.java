package Punto1;

import java.util.Scanner;

public class Menu {

    public void MenuCalculadora() throws NumeroMayora12Exception, NumeroNegativoException{
    Scanner scaner= new Scanner(System.in);
    boolean continuar= true;
    System.out.println("1--Calcular Factorial de un numero");
    System.out.println("0--Salir");
    int opcion=scaner.nextInt();
    do{

    switch(opcion){
        case 1:
        System.out.println("Ingrese un numero para calcular el factorial: ");
        int numero= scaner.nextInt();
        if (numero<0) {
             throw new NumeroNegativoException("No se aceptan numeros negativos");
        }
        else if(numero>12){
             throw new NumeroMayora12Exception("No se aceptan numeros mayores a 12");
        }
        else{
            System.out.println(CalculadoraFactorial.CalcularFactorial(numero));
            break;
        }
        case 0:
            System.out.println("Saliendo del programa");
            continuar=false;
        break;
        default:
            System.out.println("Opcion no valida");
            continuar=false;
        break;
    }
    }while(continuar);

    }
}



