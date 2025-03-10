import java.util.ArrayList;
import java.util.List;

public class Cine {
    private List<Sala> salas;         // Almacena la lista de salas del cine.
    private List<Pelicula> peliculas; // Almacena la lista de películas disponibles.
    private List<Funcion> funciones;  // Almacena la lista de funciones programadas.

    //Constructor del a clase Cine
    public Cine() {
        this.salas = new ArrayList<>();     //inicializa la lista que almacenará objetos salas.
        this.peliculas = new ArrayList<>(); //inicializa la lista que almacenará objetos Pelicula.
        this.funciones = new ArrayList<>(); //inicializa la lista que almacenará objetos funciones.

        // Inicializar salas
        salas.add(new Sala(1, false)); //Crea un nuevo objeto Sala de número 1 y valor false para el atributo que indica si es 3D 
        salas.add(new Sala(2, false)); //Crea un nuevo objeto Sala de número 2 y valor false para el atributo que indica si es 3D
        salas.add(new Sala(3, true));  //Crea un nuevo objeto Sala de número 3 y valor false para el atributo que indica si es 3D 
    }

    // Métodos para agregar películas y funciones
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);  //Agrega el objeto Pelicula proporcionado a la lista peliculas.
    }

    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);  //Agrega el objeto funcion proporcionado a la lista peliculas.
    }

    // Getters
    public List<Sala> getSalas() {   //Se declara un método getSalas que devuelve una lista de objetos Sala.
        return salas;               //Devuelve la lista salas, que contiene todos los objetos Sala del cine.
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;          //Devuelve la lista peliculas, que contiene todos los objetos Pelicula del cine.
    }

    public List<Funcion> getFunciones() {
        return funciones;           //Devuelve la lista funciones, que contiene todos los objetos Funcion del cine.
    } 
}