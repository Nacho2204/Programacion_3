package TP2_HERENCIA.EjercicioEntregable8;

public class Tarjeta{
    private String EntFinanciera;
    private String EntBancaria;
    private String numeroTarjeta;
    private double saldo;
    private long DNI;
    private String nombre;
    private String apellido;
    private String email;
    private long telefono;



    
    public Tarjeta(String entFinanciera, String entBancaria, String numeroTarjeta, double saldo, long dNI,
            String nombre, String apellido, String email, long telefono) {
        EntFinanciera = entFinanciera;
        EntBancaria = entBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getEntFinanciera() {
        return EntFinanciera;
    }
    public void setEntFinanciera(String entFinanciera) {
        EntFinanciera = entFinanciera;
    }
    public String getEntBancaria() {
        return EntBancaria;
    }
    public void setEntBancaria(String entBancaria) {
        EntBancaria = entBancaria;
    }
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public long getDNI() {
        return DNI;
    }
    public void setDNI(long dNI) {
        DNI = dNI;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    

    
    
}
