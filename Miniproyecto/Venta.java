import java.util.List;

public class Venta {
    private Funcion funcion;   // Almacena la función para la cual se venden las entradas.
    private List<Asiento> asientos;   //Almacena la lista de asientos vendidos.

    public Venta(Funcion funcion, List<Asiento> asientos) {
        this.funcion = funcion;
        this.asientos = asientos;
    }
 
    //Calcula el precio tatal de una compra.
    public double calcularTotal() {
        double total = 0;                //almacenará el costo total de los asientos.
        //Este bucle itera sobre cada objeto Asiento en la lista asientos
        for (Asiento asiento : asientos) {
            if (funcion.getSala().getNumero() == 3) {   //si el número de la sala de la función es igual a 3.
                total += 10000; // Sala 3 es 3D     -> Se suma 10000 al costo total
            } else if (asiento.getFila().charAt(0) >= 'g' && asiento.getFila().charAt(0) <= 'h') { //si la fila del asiento actual es 'g' o 'h'.
                total += 12000; // Asiento preferencial
            } else {
                total += 8000; // Asiento general
            }
        }
        return total;
    }
}