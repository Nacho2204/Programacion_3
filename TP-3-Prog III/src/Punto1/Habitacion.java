package Punto1;

import java.util.ArrayList;

public class Habitacion  {
    private int CantCamas;
    private ArrayList<Paciente> PacientesInternados;

    public Habitacion(int cantCamas) {
        this.CantCamas = cantCamas;
        this.PacientesInternados = new ArrayList<>();
    }

    public int getCantCamas() {
        return CantCamas;
    }

    public void setCantCamas(int cantCamas) {
        CantCamas = cantCamas;
    }

    public ArrayList<Paciente> getPacientesInternados() {
        return PacientesInternados;
    }

    public void setPacientesInternados(ArrayList<Paciente> pacientesInternados) {
        PacientesInternados = pacientesInternados;
    }

    public void internarPaciente(Paciente paciente) {
        
        if (paciente.isInternado()==false) {
            System.out.println("El paciente "+paciente.getNombre()+" no necesita ser internado.");
        }
        else if (PacientesInternados.contains(paciente)) {
            System.out.println("El paciente "+paciente.getNombre()+" ya está internado.");
        } else if (PacientesInternados.size() < CantCamas) {
            PacientesInternados.add(paciente);
            paciente.setInternado(true);
            System.out.println("El paciente "+paciente.getNombre()+" ha sido internado.");
        } else {
            System.out.println("La habitación está llena.");
        }
    }

    public void darDeAltaPaciente(Paciente paciente) {
        if (PacientesInternados.remove(paciente)) {
            paciente.setInternado(false);
            System.out.println("El paciente " + paciente.getNombre() + " ha sido dado de alta.");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " no se encontró en la habitación.");
        }
    }
}
