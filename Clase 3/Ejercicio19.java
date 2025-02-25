import java.util.Scanner; // importamos la clase Scanner para la entrada de datos 
public class MtrizDiagonal{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in)// Crear objeto scanner para leer entrada del usuatio
        //pedir dimensiones de la matriz al usuario
        System.out.print("Ingrese el numero de filas (n): ");
        int n = sc.nextInt();
         System.out.print("Ingrese el numero de columnas (n): ");
        int m = sc.nextInt();
        // Definit la matriz con las dimensiones ingresadas 
        int matriz[][] = new int[n][m];
        //Llenar la matriz con la 1 en diagonal principal y 0 en el resto 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i== j){
                    matriz[i][j]=1; // Asignar 1 en la diagonal principal 
                
                } else{
                    matriz[i][j]=0; Asignar 0 en resto de la matriz 
                }
            }
        }
        System.out.println("Matriz con diagonal principal en 1:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; i++){
                for( int j= 0; j<m; j++){
                    System.out.print(matriz[i][j]+ "");
                }
                System.out.println();
            }
            sc.close();
        }
    }
}