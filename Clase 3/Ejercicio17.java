public class SumaFilasColumnas{
    public static void main (String[]args){
        // Aqui defini la matriz 
        int matriz[][]={
            { 1,2,3}
            { 4,5,6}
            { 7,8,9}

        };
        int filas = matriz.length; // Este es el numero de filas 
        int columnas = matriz[0].length; // Este es el numero de columnas 
        // Sumar elementos de cada fila
        System.out.println("Suma de cada fila: ");
        for(int i =0; i< filas; i++){
            int sumaFila = 0; // Aqui se almacena la suma de las filas 
            for(int j= 0; j< columnas; j++){
                sumaFila += matriz[i][i]; // Suma cada elemento de la fila 
            }
            System.out.println("Fila" + (i+1) + ":"+ sumaFila);
        }
        System.out.println("\nSuma de cada columnas: ");
        for(int j=0; j< columnas; j++){
            int sumaColumnas=0;
            for( int i=0; i<filas; i++){
                sumaColumnas += matriz[i][i];
            }
            System.out.println("Columnas" + (j+1)+ "+ sumaColumnas");
        }
    }
}