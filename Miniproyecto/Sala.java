import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;        //Alamacena el numero de la sala     
    private boolean es3D;             //Indica si la sala es 3D (true) o no (false).
    private List<Asiento> asientos;   //Almacena una lista de asientos en la sala.

    //Constructor de la clase Sala. Recibe dos parámetros: numero y es3D.
    public Sala(int numero, boolean es3D) {
        this.numero = numero;
        this.es3D = es3D;
        this.asientos = new ArrayList<>();

        // Inicializar asientos generales
        for (char fila = 'a'; fila <= 'f'; fila++) {                                 
            for (int numeroAsiento = 1; numeroAsiento <= 12; numeroAsiento++) {
                asientos.add(new Asiento(String.valueOf(fila), numeroAsiento)); //crea un nuevo objeto Asiento y lo agrega a la lista asientos.
            }
        }

        // Inicializar asientos preferenciales (solo para salas 1 y 2)
        if (numero == 1 || numero == 2) {
            for (char fila = 'g'; fila <= 'h'; fila++) {
                for (int numeroAsiento = 1; numeroAsiento <= 9; numeroAsiento++) {
                    asientos.add(new Asiento(String.valueOf(fila), numeroAsiento));
                }
            }
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public Asiento getAsiento(String fila, int numero) {
        //Este bucle itera sobre cada objeto Asiento en la lista asientos.
        for (Asiento asiento : asientos) {        
            if (asiento.getFila().equalsIgnoreCase(fila) && asiento.getNumero() == numero) {  
                return asiento; //Compara la fila y el numero del asiento actual con la fila proporcionada, ignorando mayúsculas y minúsculas.
            }
        }
        return null;
    }
}