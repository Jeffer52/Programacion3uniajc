public class Asiento {
    private String fila;          //Almacena la fila del asiento
    private int numero;           //Almacena el número del asiento
    private boolean ocupado;      //Indica si el asiento está ocupado (true) o no (false)

    //Constructor de la clase Asiento
    public Asiento(String fila, int numero) {
        this.fila = fila;               //Asigna los valores de los parámetros a los atributos fila y numero.  
        this.numero = numero;         
        this.ocupado = false;         //Inicializa el atributo ocupado como false (el asiento está libre por defecto).
    }

    // Getters y métodos para ocupar el asiento, acceder y modificar los atributos de la clase.
    public String getFila() {
        return fila;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }
}