package Punto6;
import java.time.LocalDate;

public abstract class Empleado {
    protected int ID;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected LocalDate fechaIngreso;
    protected int sueldo;
    
    
    public Empleado() {
    }
    protected String tipoEmpleado;
    
    public Empleado(int iD, String nombre, String apellido,
                     int edad, LocalDate fechaIngreso, int sueldo, String tipoEmpleado) {
        this.ID = iD;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    
    public void mostrarTareas(){}
    
    public void agregarEmpleado(){}

    public void eliminarEmpleado(int id){}

    public void mostrarTodosLosEmpleados(){}

    public void buscarEmpleado(String nombreEmpleado){}

    public void verCantidadEmpleados(){}

    public void mostrarEmpleadosPorTipo(String tipo){}
}
