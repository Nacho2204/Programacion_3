package Punto3;
import java.util.List;

public class NumerosImparesLista {
    //Contar la cantidad de números impares de una lista.
    public static int contarImpares(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            int count = 0;
            int num = lista.get(0);
            if (num % 2 != 0) {
                count = 1;
            }
            return count + contarImpares(lista.subList(1, lista.size()));
        }
    }
    
}
