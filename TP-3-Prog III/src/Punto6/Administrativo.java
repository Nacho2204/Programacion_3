package Punto6;

import java.time.LocalDate;

public class Administrativo extends Empleado {

    

    public Administrativo(int iD, String nombre, String apellido, int edad, LocalDate fechaIngreso, int sueldo){
        super(iD, nombre, apellido, edad, fechaIngreso, sueldo, "Administrativo");
        
    }

    @Override
    public void mostrarTareas(){

        System.out.println(this.nombre+" se dedica a la administracion en la empresa.");

    }
}

