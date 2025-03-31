// Definición de la clase Pila con una pila de cadenas de caracteres
class Pila {
    private java.util.Stack<String> pila = new java.util.Stack<>(); // Se usa una pila de cadenas

    public void insertar(String valor) { pila.push(valor); } // Inserta un elemento en la pila

    public String quitar() { 
        if (!pila.isEmpty()) return pila.pop(); // Quita y devuelve el elemento en la cima
        else throw new RuntimeException("La pila está vacía"); // Manejo de error si la pila está vacía
    }

    public boolean pilaVacia() { return pila.isEmpty(); } // Verifica si la pila está vacía

    // Método para mostrar los elementos de la pila sin perder su contenido
    public void mostrarPila() {
        Pila auxiliar = new Pila(); // Se crea una pila auxiliar

        // Se extraen los elementos de la pila original y se almacenan en la auxiliar
        while (!this.pilaVacia()) {
            String elemento = this.quitar(); // Extrae el elemento de la pila original
            System.out.println(elemento); // Muestra el elemento
            auxiliar.insertar(elemento); // Lo almacena en la pila auxiliar
        }

        // Se restauran los elementos en la pila original
        while (!auxiliar.pilaVacia()) {
            this.insertar(auxiliar.quitar()); // Se insertan de nuevo en la pila original
        }
    }
}

// Clase principal para probar el método mostrarPila()
public class EjercicioPila {
    public static void main(String[] args) {
        Pila p = new Pila(); // Se crea una pila vacía

        // Se insertan elementos en la pila
        p.insertar("Hola");
        p.insertar("Mundo");
        p.insertar("Java");
        p.insertar("Ejercicio");

        // Se muestra el contenido de la pila sin perder los elementos
        p.mostrarPila();
    }
}