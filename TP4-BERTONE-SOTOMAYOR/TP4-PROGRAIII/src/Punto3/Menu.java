package Punto3;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scaner= new Scanner(System.in);

    public void Menu() {
        boolean continuar = true;
        System.out.println("1--Cadena de caracteres esten presente en su lista de caracteres.");
        System.out.println("2--Contar los numeros inpares de una lista.");
        System.out.println("3--Determinar si una lista es creciente.");
        System.out.println("4--Determinar el maximo valor de una lista.");
        System.out.println("0--Salir");

        do {
            System.out.println("Ingrese una opcion");
            int opcion = scaner.nextInt();
            switch (opcion) {
                case 1:
                   System.out.println("Ingrese una lista");
                   List<String> lista1 = new ArrayList<>();
                   for (int i = 0; i < 5; i++) { //le dimos un maximo de 5 palabras
                       lista1.add(scaner.next());
                   }
                   System.out.println("Ingrese la palabra que quiera buscar");
                   String buscado = scaner.next();
                   boolean encontrado = (CadenaCaracteresPresenteenLista.CadenaCaracteresEnLista(lista1, buscado));
                   System.out.println("La palabra " + (encontrado ? "si" : "no") + " se encuentra en la lista");
                break;

                case 2:
                System.out.println("Ingrese una lista");
                List<Integer> lista2 = new ArrayList<>();
                for (int i = 0; i < 5; i++) { //le dimos un maximo de 5 numeros
                    lista2.add(scaner.nextInt());
                }
                int cantidadDeImpares = NumerosImparesLista.contarImpares(lista2);
                System.out.println("La cantidad de numeros impares es de: " + cantidadDeImpares);
                break;

                case 3:
                System.out.println("Ingrese una lista");
                List<Integer> lista3 = new ArrayList<>();
                for (int i = 0; i < 5; i++) { 
                    lista3.add(scaner.nextInt());
                }
                boolean creciente = EnterosCrecientes.esCreciente(lista3);
                System.out.println("La lista "+ (creciente ? "si" : "no") + " es creciente");
                break;

                case 4:
                System.out.println("Ingrese una lista");
                List<Integer> lista4 = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    lista4.add(scaner.nextInt());
                }
                int maximo = MaximodeListaValores.MaxListaValores(lista4);
                System.out.println("El maximo valor de la lista es: " + maximo);
                break;

                case 0:
                System.out.println("Saliendo del programa");
                continuar = false;
                break;

                default:
                System.out.println("Opcion no valida");
                break;
                }
        } while (continuar);
    }
}
