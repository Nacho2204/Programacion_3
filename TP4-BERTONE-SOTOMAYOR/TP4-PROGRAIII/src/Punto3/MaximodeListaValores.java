package Punto3;

import java.util.List;

public class MaximodeListaValores {
    public static int MaxListaValores(List<Integer> list){
        if (list.size()==0) {
            return Integer.MIN_VALUE; //si esta vacia retorna un valor que indique que la lista esta vacia
        }
        else{
            int first = list.get(0);
            List<Integer> restOfList = list.subList(1, list.size());
            int maxOfRest = MaxListaValores(restOfList);
            return Math.max(first, maxOfRest); 
        }
    }
}
