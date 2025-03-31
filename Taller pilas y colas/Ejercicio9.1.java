// Definición de la clase Pila (estructura tipo LIFO - Último en entrar, primero en salir)
class Pila {
    private java.util.Stack<Integer> pila = new java.util.Stack<>(); // Se usa una pila de enteros

    public void insertar(int valor) { pila.push(valor); } // Inserta un elemento en la pila

    public int quitar() { 
        if (!pila.isEmpty()) return pila.pop(); // Quita y devuelve el elemento en la cima
        else throw new RuntimeException("La pila está vacía"); // Manejo de error si la pila está vacía
    }

    public int cimaPila() { 
        if (!pila.isEmpty()) return pila.peek(); // Devuelve el elemento en la cima sin quitarlo
        else throw new RuntimeException("La pila está vacía");
    }

    public boolean pilaVacia() { return pila.isEmpty(); } // Devuelve true si la pila está vacía
}

// Clase principal con el código del ejercicio 9.1
public class EjercicioPila {
    public static void main(String[] args) {
        Pila p = new Pila(); // Se crea una pila vacía
        int x = 4, y; // Se inicializan las variables

        p.insertar(x); // Se inserta 4 en la pila → [4]

        System.out.println("\n" + p.cimaPila()); // Imprime la cima de la pila → 4

        y = p.quitar(); // Se extrae 4 de la pila y se guarda en y → la pila queda vacía

        p.insertar(32); // Se inserta 32 en la pila → [32]

        p.insertar(p.quitar()); // Se extrae 32 y se vuelve a insertar → la pila sigue igual [32]

        do {
            System.out.println("\n " + p.quitar()); // Extrae e imprime el último elemento (32)
        } while (!p.pilaVacia()); // Se repite hasta que la pila esté vacía
    }
}
// salida: 4 32