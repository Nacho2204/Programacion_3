package Punto6;

import java.time.LocalDate;

public class Op_Maestranza extends Empleado{

    public Op_Maestranza(int iD, String nombre, String apellido, int edad, LocalDate fechaIngreso, int sueldo){
        super(iD, nombre, apellido, edad, fechaIngreso, sueldo,"Operario Maestranza");
    }

    @Override
    public void mostrarTareas(){

        System.out.println(this.nombre+" realiza tareas de limpieza y lavado en general.");

    }
}
