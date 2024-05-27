package Punto1;

public class Main {

    public static void main(String[] args) {
        Paciente paciente1= new Paciente("Nacho", "Sotomayor", 46637235, false);
        Paciente paciente2= new Paciente("Paco", "Sotomayor", 46637235, true);
        Paciente paciente3= new Paciente("Manolo", "Sotomayor", 46637235, true);
        Paciente paciente4= new Paciente("Pepa", "Sotomayor", 46637235, true);

        Habitacion habitacion1 = new Habitacion(3);

        habitacion1.internarPaciente(paciente1);
        habitacion1.internarPaciente(paciente4);
        habitacion1.internarPaciente(paciente4);
        habitacion1.internarPaciente(paciente2);
        habitacion1.darDeAltaPaciente(paciente2);
        

    }

}
