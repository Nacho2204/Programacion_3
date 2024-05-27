package Punto6;

import java.time.LocalDate;

public class Vendedor extends Empleado {
    
    public Vendedor(int iD, String nombre, String apellido, int edad, LocalDate fechaIngreso, int sueldo){
        super(iD, nombre, apellido, edad, fechaIngreso, sueldo, "Vendedor");
    }
    @Override
    public void mostrarTareas(){

        System.out.println(this.nombre+" realiza ventas en la empresa.");

    }
}
