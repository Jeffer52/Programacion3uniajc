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
// Ejercicio 3: Sumar pares e impares 
public class Ejercicio 3 {
    public static void main(String[]arg){
        int[] numero = {1,2,3,4,5,6}
        int sumaPares= 0, sumaImpares=0; // Variable para almacenar la suma de numeros pares e impares 
        for(int numero: numero){ // Esto sirve para verificar si el numero es impar 
            if (numero % 2 ==0){ 
                sumaPares += numero;// Si es par, lo sumamos a sumaPares
            }esle{
                sumaImpares+= numeros; // Si es impar, lo sumamos a sumaImpares 
            }
        }

        System.out.println("Suma pares: " + sumaPares);
        System.ou.println("Suma impares: "+ sumaImpares)
    }

}
// Ejercicio 4 : Encontrar el mayor valor de dos arreglos 
 public class Ejercicio 4 {
        public static void main(String[]args){
          int[] arregloA = { 23, 45, 12};
          int[]arregloB = { 34,56,67}; // Encontramos el mayor valor en cada arreglo
          int mayorA= encontrarMayor(arregloA);
          int mayorB = encontrarMayor(arregloB); // Esto sirve para determinar el valor entre los arreglos
          int mayor = Math.max(mayorA, mayorB);
          System.out.println("Mayor valor: "+ mayor);
        
    }
    public static int encontrarMayor(int[]arreglo){
        int maximo = arreglo[0]; // Inicilizamos con el primer elemento del arreglo
        for(int numero: arreglo)// Recorremos cada numero en el arreglo 
         {
            if (numero >maximo){
                maximo = numero; //Si el numero actual es mayor que el maximos actual, lo actualizamos 
            }
        }
        return maximo; // Devolver el valor maximo 
    }
 }
 
