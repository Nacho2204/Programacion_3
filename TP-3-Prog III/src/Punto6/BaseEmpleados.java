package Punto6;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class BaseEmpleados extends Empleado{
    
    protected List<Empleado> listaEmpleados = new ArrayList <>();

    public BaseEmpleados(){}

    public BaseEmpleados(int iD, String nombre, String apellido, int edad, LocalDate fechaIngreso, int sueldo,String tipoEmpleado){
        super(iD, nombre, apellido, edad, fechaIngreso, sueldo,tipoEmpleado);
        this.listaEmpleados = new ArrayList<>();
    }

    public BaseEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Empleado> getlistaEmpleados() {
        return listaEmpleados;
    }

    public void setlistaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    
    @Override
        public void agregarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del empleado:");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de ingreso del empleado (yyyy-MM-dd):");
        String fechaIngresoStr = scanner.nextLine();
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("Ingrese el sueldo del empleado:");
        int sueldo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tipo del empleado (Administrativo, Op_Maestranza, Vendedor):");
        String tipo = scanner.nextLine();

        Empleado nuevoEmpleado;
        switch (tipo.toLowerCase()) {
            case "administrativo":
                nuevoEmpleado = new Administrativo(id, nombre, apellido, edad, fechaIngreso, sueldo);
                break;
            case "operario maestranza":
                nuevoEmpleado = new Op_Maestranza(id, nombre, apellido, edad, fechaIngreso, sueldo);
                break;
            case "vendedor":
                nuevoEmpleado = new Vendedor(id, nombre, apellido, edad, fechaIngreso, sueldo);
                break;
            default:
                System.out.println("Tipo de empleado no reconocido. Empleado no agregado.");
                return;
        }

        listaEmpleados.add(nuevoEmpleado);
        System.out.println("El empleado fue agregado.");
    }

    @Override
    public void eliminarEmpleado(int id){
        int idBuscado = id;
        
        for(int i = 0 ; i < listaEmpleados.size() ; i++){
            Empleado empleado = listaEmpleados.get(i);
            if (idBuscado == empleado.getID()) {

                listaEmpleados.remove(i);
                System.out.println("El empleado con el id "+idBuscado+ " fue eliminado de la lista.");

            }
        }
    }

    @Override
    public void mostrarTodosLosEmpleados(){
        
        for(int i = 0 ; i < listaEmpleados.size() ; i++){
                Empleado empleado = listaEmpleados.get(i);
                System.out.println( 
                "Nombre: "+ empleado.getNombre() +" || "+ 
                "Apellido: "+empleado.getApellido()+ " || "+
                "Fecha de ingreso: "+ empleado.getFechaIngreso()+"\n"
                );
        
        }
    }   

    @Override
    public void buscarEmpleado(String nombreEmpleado){
        String empleadoBuscado = nombreEmpleado;

        for(int i = 0 ; i < listaEmpleados.size() ; i++){

            Empleado empleado = listaEmpleados.get(i);
            if (empleadoBuscado == empleado.getNombre()) {

                System.out.println("El empleado fue encontrado y sus datos son: \n"+
                "ID: " +empleado.getID() + 
                "\nNombre: "+ empleado.getNombre() + 
                "\nApellido: "+empleado.getApellido()+
                "\nEdad: "+ empleado.getEdad() +
                "\nFecha de ingreso: "+ empleado.getFechaIngreso()+
                "\nSueldo: "+empleado.getSueldo());
            }
        }
    }

    @Override
    public void verCantidadEmpleados(){
        int cantidad = 0;
        for(int i = 0; i<listaEmpleados.size();i++){

            cantidad = cantidad+1;

        }
        System.out.println("Hay "+ cantidad + " empleados.");
    }

    @Override
    public void mostrarEmpleadosPorTipo(String tipo){
        String tipoBuscado = tipo;
        for(int i = 0; i<listaEmpleados.size(); i++){

            Empleado empleado = listaEmpleados.get(i);

            if (tipoBuscado == empleado.getTipoEmpleado()) {
                System.out.println(empleado.getNombre()+" "+empleado.getApellido());
            }
        }

    }
}
