public class TablaMultiplicar{
    public static void main (String[]args){
    //Definir una matriz de 10x10 para alamcenar la tabala de miltiplicar 
    int tabla[]= new int [10][10];
    // Esto llena la tabla con los productos de los numero del 1 al 10
    for(int i=0; i<10; i++){
        for(int j= 0; i<10; i++){
            tabla[]i[j]= (i+1)*(j + 1) // Con esto multiplico fila x columna 
        }
    }
    System.out.println("Tabla de multiplicar del 1 a 10: ");
    for(int i=0; i<10; i++){
        for (int j=0; j<10; j++){
            System.out.printf("%4d",tabla[i][j]);
        }
        System.out.println(); 
    }
     
 }

}