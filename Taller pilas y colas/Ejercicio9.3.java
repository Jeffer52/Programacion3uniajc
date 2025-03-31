import java.util.Stack;

public class InfijaAPostfija {

    // Método para definir la prioridad de los operadores
    private static int prioridad(char operador) {
        switch (operador) {
            case '^': return 3; // Mayor prioridad
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default: return 0;
        }
    }

    // Método para convertir una expresión infija a postfija
    public static String convertirAPostfija(String expresion) {
        Stack<Character> pila = new Stack<>(); // Pila para operadores
        StringBuilder postfija = new StringBuilder(); // Resultado en notación postfija

        for (char c : expresion.toCharArray()) {
            if (Character.isLetterOrDigit(c)) { // Si es operando (número o variable)
                postfija.append(c).append(' '); // Se añade a la salida
            } else if (c == '(') {
                pila.push(c); // Se apila '('
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop()).append(' '); // Desapila hasta '('
                }
                pila.pop(); // Se elimina '('
            } else { // Es un operador
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(c)) {
                    postfija.append(pila.pop()).append(' '); // Desapila operadores con mayor prioridad
                }
                pila.push(c); // Apila el operador actual
            }
        }

        // Vaciar la pila al final
        while (!pila.isEmpty()) {
            postfija.append(pila.pop()).append(' ');
        }

        return postfija.toString().trim(); // Retorna la expresión en postfija
    }

    public static void main(String[] args) {
        String expresionInfija = "(x-y)/(z+w)-(z+y)^x"; // Expresión de entrada
        String expresionPostfija = convertirAPostfija(expresionInfija); // Conversión
        System.out.println("Expresión en notación postfija: " + expresionPostfija);
    }
}