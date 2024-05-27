package Punto6;

public class Main {
    public static void main(String[] args) {
        BaseEmpleados base1 = new BaseEmpleados();

        base1.agregarEmpleado();
        base1.agregarEmpleado();
        base1.agregarEmpleado();
        base1.agregarEmpleado();
        base1.agregarEmpleado();
        base1.agregarEmpleado();

        base1.mostrarTodosLosEmpleados();

        base1.mostrarEmpleadosPorTipo("Administrativo");

        base1.eliminarEmpleado(74);
        base1.eliminarEmpleado(65);

        base1.buscarEmpleado("Juan");

        base1.verCantidadEmpleados();
    }
}
