package Punto2;

public class Motor {
    
    private int kilometraje;
    private int numMotor;
    private String cilindrada;

    public Motor(int kilometraje, int numMotor, String cilindrada) {
        this.kilometraje = kilometraje;
        this.numMotor = numMotor;
        this.cilindrada = cilindrada;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
}
