public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    //consructores
        public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //metodos
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(sexo);
        System.out.println(edad);
        System.out.println(ciudad);
        
    }

    public void mayorDeEdad(){
        if (edad > 18) {
            System.out.println(nombre + " es mayor de edad.");
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(sexo);
            System.out.println(edad);
            System.out.println(ciudad);
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
    
}
