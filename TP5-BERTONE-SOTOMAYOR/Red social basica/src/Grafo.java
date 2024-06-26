import java.util.*;

class Grafo {
    private Map<String, Usuario> usuarios;
    private Map<Usuario, List<Usuario>> relaciones;

    public Grafo() {
        usuarios = new HashMap<>();
        relaciones = new HashMap<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario);
        relaciones.put(usuario, new ArrayList<>());
    }

    public void agregarAmistad(Usuario usuario1, Usuario usuario2) {
        relaciones.get(usuario1).add(usuario2);
        relaciones.get(usuario2).add(usuario1);
    }

    public Usuario obtenerUsuario(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }
    
    /*ya que en el enunciado dice"Representación de grafos, búsqueda en
      anchura (BFS) y profundidad (DFS)", decidimos poner las dos formas
      en la interfaz, las dos muestran lo mismo, lo que cambia es el metodo de cada una*/

   
    public Set<Usuario> buscarBFS(Usuario usuario) {    //lo hicimos con colas por comodidad
        Set<Usuario> visitados = new HashSet<>();
        Queue<Usuario> cola = new LinkedList<>();
        cola.add(usuario);
        while (!cola.isEmpty()) {
            Usuario actual = cola.poll();
            if (!visitados.contains(actual)) {
                visitados.add(actual);
                cola.addAll(relaciones.get(actual));
            }
        }
        return visitados;
    }
    
    //para esta busqueda pudimos haber utilizado recursividad pero nos parecio mas eficiente de esta manera
    public Set<Usuario> buscarDFS(Usuario usuario) {
        Set<Usuario> visitados = new HashSet<>();
        Stack<Usuario> pila = new Stack<>();
        pila.push(usuario);
        while (!pila.isEmpty()) {
            Usuario actual = pila.pop();
            if (!visitados.contains(actual)) {
                visitados.add(actual);
                pila.addAll(relaciones.get(actual));
            }
        }
        return visitados;
    }

    public boolean sonAmigos(Usuario usuario1, Usuario usuario2) {
        return relaciones.get(usuario1).contains(usuario2);
    }
    
    

}
