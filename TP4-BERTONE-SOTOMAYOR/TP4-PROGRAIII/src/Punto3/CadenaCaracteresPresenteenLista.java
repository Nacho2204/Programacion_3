package Punto3;
import java.util.List;
public class CadenaCaracteresPresenteenLista {
    public static boolean CadenaCaracteresEnLista(List<String> lista, String cadena) {
        if (lista.isEmpty()) {
            return false;
        } else {
            return lista.get(0).contains(cadena) || CadenaCaracteresEnLista(lista.subList(1, lista.size()), cadena);
        }
    }
}
