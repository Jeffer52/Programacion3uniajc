import java.util.Stack;
import java.util.Random;

public class EjecutarPila { 
    public static void main(String[] args) {

        // 1. Crear un array de 10 números reales
        double[] numeros = new double[10];
        Stack<Double> pila = new Stack<>(); // Crear una pila para almacenar los números
        Random random = new Random(); // Generador de números aleatorios

        // 2. Llenar el array con números aleatorios entre 0 y 100
        System.out.println("Secuencia original:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = Math.round(random.nextDouble() * 10000.0) / 100.0; // Números con 2 decimales
            System.out.print(numeros[i] + " "); // Mostrar número generado
            pila.push(numeros[i]); // Insertar en la pila
        }

        // 3. Extraer e imprimir los números de la pila
        System.out.println("\n\nExtrayendo elementos de la pila:");
        while (!pila.empty()) { // Mientras la pila no esté vacía
            System.out.print(pila.pop() + " "); // Extrae y muestra el número en la cima
        }
    }
}