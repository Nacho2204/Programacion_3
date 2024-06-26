package Punto1;

public class CalculadoraFactorial {
    public static int CalcularFactorial(int numero){
        if (numero==0) {
            return 1;
        }
        else{
            return numero*CalcularFactorial(numero-1);
        }
    }
}
