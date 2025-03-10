ublic class Funcion {
    private String horario;      
    private Pelicula pelicula;   
    private Sala sala;           

    public Funcion(String horario, Pelicula pelicula, Sala sala) {
        this.horario = horario;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    // Getters
    public String getHorario() {
        return horario;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }
}