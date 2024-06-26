import java.util.*;

class Usuario {
     private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
