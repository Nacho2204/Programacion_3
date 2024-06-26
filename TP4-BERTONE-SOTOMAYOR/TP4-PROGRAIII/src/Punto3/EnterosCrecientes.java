
package Punto3;
import java.util.List;


public class EnterosCrecientes {
    public static boolean esCreciente(List<Integer> lista) {
        if (lista.isEmpty()) {
            return true; // si la lista esta vacia, es creciente
        }
        else if (lista.size() == 2) {
            return lista.get(0) < lista.get(1);// si la lista tiene dos elementos, se compara el primero con el segundo
            }
        else{
        return lista.get(0) <= lista.get(1) && esCreciente(lista.subList(1, lista.size()));
        }
    }
}