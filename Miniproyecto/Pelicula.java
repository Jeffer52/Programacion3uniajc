public class Pelicula {
    private String nombre;   //Almacena el nombre de la película.          
    private String idioma;   //Almacena el idioma de la película.          
    private String tipo;     // 35mm o 3D  
    private int duracion;    // en minutos

   // Constructor de la clase Pelicula
    public Pelicula(String nombre, String idioma, String tipo, int duracion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    // Getters para acceder a los atributos de la clase.
    public String getNombre() {   //Estos métodos permiten obtener el valor de los atributos desde fuera de la clase.
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDuracion() {
        return duracion;
    }
}