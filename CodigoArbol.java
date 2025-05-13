// Clase que representa un nodo del árbol
class Nodo { 
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor del nodo
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

// Clase del árbol binario
public class ArbolBinario {
    Nodo raiz;

    // Constructor del árbol: al principio no tiene nodos
    public ArbolBinario() {
        raiz = null;
    }

    // Método público para insertar un valor
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un valor en el árbol
    private Nodo insertarRec(Nodo nodo, int valor) {
        // Si el nodo es null, crea uno nuevo
        if (nodo == null) {
            return new Nodo(valor);
        }

        // Si el valor es menor, va al subárbol izquierdo
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        }
        // Si el valor es mayor, va al subárbol derecho
        else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }

        // Si el valor ya existe, no lo insertamos (puedes cambiar esta lógica)
        return nodo;
    }

    // Método para recorrer el árbol en orden (izquierda, raíz, derecha)
    public void recorridoInOrden() {
        recorridoInOrdenRec(raiz);
    }

    // Método recursivo del recorrido en orden
    private void recorridoInOrdenRec(Nodo nodo) {
        if (nodo != null) {
            recorridoInOrdenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoInOrdenRec(nodo.derecho);
        }
    }

    // Método principal para probar el árbol
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos algunos valores
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        // Imprimimos el recorrido en orden (de menor a mayor)
        System.out.println("Recorrido en orden:");
        arbol.recorridoInOrden();
    }
}
