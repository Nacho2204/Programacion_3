package Punto2;

public class Auto {

    private String patente;
    private String marca;
    private int modelo;
    private Motor motor;

    public Auto(String patente, String marca, int modelo, int kilometraje, int numMotor, String cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(kilometraje, numMotor, cilindrada);
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    

    

}
