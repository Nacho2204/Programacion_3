public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    //constructores
   
    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }

    public void encender(){
        System.out.println("El auto se encendio");
    }

    public void kilometrajeMayor(){
        if (km>100000) {
            System.out.println("El auto supera los 100000km");
            System.out.println(color);
            System.out.println(patente);
            System.out.println(año);
            System.out.println(modelo);
            System.out.println(km);
        }
        else{
            System.out.println("El auto no supera los 100000km");
        }

    }
}
