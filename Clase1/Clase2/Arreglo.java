// Ejercicio 1 suma de los N numeros 
public class Ejercicio{
    public static void main(String[]arg){
        int[] numero = {1,2,3,4,5}
        int suma= 0; // Variable para almacenar la suma de los elementos del arreglo
        for (int numero : numero){ // Blucle que recorre cada numero en el arreglo 
            suma += numeros //Acomulamos la suma  de los arreglos 
        }
        System.out.println("Suma total: "+ suma)
    }
}
// Ejercicio 2: Neto a pagar de empleados 
public Ejercicio 2 
public static void main(String[]args){
    int[]suplemento = {100,1200,1100};//Arreglo que representa los sumplementos salariales de los empleados
    int[]asignacion = {200,150,180};//Arreglo que representa las asignaciones adicionales  de los empleados
    int[]deducciones = {100, 90,80};//Arreglo que representa las deducciones que se le hacen a los empleados
    for(int i=0; < suplementos.length; i++){ // Bucle for que recorre la lista de empleados 
        int neto = suplemento[i] + asignaciones[i]- deducciones[i]; //Calculo del sueldo neto para cada empleado 
        System.out.println("Empleado " + (i+1)+ " - Neto: " + neto);
    }
  }

}