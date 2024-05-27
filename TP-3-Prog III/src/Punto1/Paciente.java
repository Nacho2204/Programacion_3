package Punto1;

public class Paciente {
    protected String Nombre;
    protected String Apellidos;
    protected long Dni;
    protected boolean Internado;

    public Paciente(String Nombre, String Apellidos, long Dni, boolean Internado) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Dni = Dni;
        this.Internado = Internado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long dni) {
        Dni = dni;
    }

    public boolean isInternado() {
        return Internado;
    }

    public void setInternado(boolean internado) {
        Internado = internado;
    }
    
}
