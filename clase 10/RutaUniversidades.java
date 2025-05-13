package com.mycompany.dijkstra;

public class RutaUniversidades {

    private static final int INFINITO = Integer.MAX_VALUE;

    public static void dijkstra(int[][] grafo, int nodoInicio, int nodoDestino) {
        int numNodos = grafo.length;
        int[] distancias = new int[numNodos];
        boolean[] visitados = new boolean[numNodos];
        int[] previos = new int[numNodos];

        for (int i = 0; i < numNodos; i++) {
            distancias[i] = INFINITO;
            visitados[i] = false;
            previos[i] = -1;
        }

        distancias[nodoInicio] = 0;

        for (int i = 0; i < numNodos - 1; i++) {
            int nodoMin = nodoConDistanciaMinima(distancias, visitados);
            visitados[nodoMin] = true;

            for (int j = 0; j < numNodos; j++) {
                if (!visitados[j] && grafo[nodoMin][j] > 0 &&
                    distancias[nodoMin] != INFINITO &&
                    distancias[nodoMin] + grafo[nodoMin][j] < distancias[j]) {
                    
                    distancias[j] = distancias[nodoMin] + grafo[nodoMin][j];
                    previos[j] = nodoMin;
                }
            }
        }

        System.out.println("Costo mínimo desde Sur hasta N: " + distancias[nodoDestino]);
        System.out.print("Ruta óptima: ");
        imprimirRuta(previos, nodoDestino);
        System.out.println();
    }

    private static int nodoConDistanciaMinima(int[] distancias, boolean[] visitados) {
        int min = INFINITO;
        int nodoMin = -1;

        for (int i = 0; i < distancias.length; i++) {
            if (!visitados[i] && distancias[i] <= min) {
                min = distancias[i];
                nodoMin = i;
            }
        }

        return nodoMin;
    }

    private static void imprimirRuta(int[] previos, int nodoActual) {
        if (nodoActual == -1) return;

        imprimirRuta(previos, previos[nodoActual]);
        System.out.print(nombreNodo(nodoActual) + " ");
    }

private static String nombreNodo(int i) {
    switch (i) {
        case 0:
            return "Sur";
        case 1:
            return "P2";
        case 2:
            return "P3";
        case 3:
            return "P4";
        case 4:
            return "N";
        default:
            return "Desconocido";
    }
}
    public static void main(String[] args) {
        int[][] grafo = {
            {0, 7, 0, 0, 0}, // Sur
            {7, 0, 1, 6, 0}, // P2
            {0, 1, 0, 2, 3}, // P3
            {0, 6, 2, 0, 4}, // P4
            {0, 0, 3, 4, 0}  // N
            
        };

        int nodoInicio = 0; // Sur
        int nodoDestino = 4; // N

        dijkstra(grafo, nodoInicio, nodoDestino);
    }
}
