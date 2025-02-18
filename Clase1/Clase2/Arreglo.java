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
 // Ejercicio 5 : Total gastado en producto
 public class Ejercicio5{
    public static void main(String []args){
        int[] precios = { 10, 20, 30};
        int[] cantidades = {2,3,1};
        int total = 0;// Variable para almacenar el total gastado
        fo( int i=0; i<precios.length; i++){ // Esto sirve para recorrer los arreglos para calcular el total gastado 
            total += precios[i]*cantidades[i]; // Sumamos el precio multiplicado por cantidades 
        }
        System.out.println("Total gastado: "+ total);
    }
 }
  //Ejercicio 6: Ganancias por vivienda 
 public class Ejercicio6{
    public static void main (String[]args){
        int[]precio = { 500,700,800 };
        double[]porcentaje={10,15,12};
        for(int i=0; i=0; i<precios.length; i++){ //Sirve para recorrer los arreglos para calcular las ganancias 
            double ganancias= precios[i]*(porcentajes[i]/100);//Calculamos la ganancia para cada vivienda


System.out.println(" Ganancias de vivienda" + (i+1)+ " : " + ganancias);

        }
    }
 }
 // Ejercicio 7: separar pares e impares
 public Ejercicio7{
    public static void main ( String[ arg]{
        int[]numeros = n{ 10,3,4,5,6,7,8};
        for(int numero : numero){ // Recorremos el numero del arreglo
            if)(numero % 2==0){ // Esto sirve para verificar si el numero es par 
                System.out.println("Par :" + numero);
            }else{
                System.out.println("Impar: "+ numero);
            }
        }
    }
 }
 // Ejercicio 8: Mayor, menor y repeticiones
 public class Ejercicio8{
    public static void main (String[]args){
        int[] numero = {5,1,2,5,3,1,5}
        //Inicializamos las variables para el mayor, menor y sus repeticiones
        int mayor= numeor [0];
        int menor = numero[0];
        int repeticionesMayor=0;
        int repeticionesMenor = 011,
        //Encontramos el mayor y el menor numero del arreglo
        for(int numero: numero){
            if(numero > mayor){
                mayor=numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        //Contamos las repeticiones del mayor y del menor
        for(int numero : numero){
            if(numero==mayor){
                repeticionesMayor++;
            }
            if(numero == menor){
                repeticionesMenor++;
            }
        }
        System.out.println("Mayor: "+ mayor + " (se repite" + repeticionesMayor + " veces")");
        System.out.println("Menor: "+ menor + " (se repite" + repeticionesMenor + " veces")");
    }
 }
 // Ejercicio 9:Contar ocurrencias de un numero
 public class Ejercicio9{
    public static void main(String[]args){
        int[]arreglo = {4,6,8,2,6,9,6,2};
        //Numero que queremos contar 
        int incognita= 6;
        //Variable para contar las ocurrencias 
        int contar = 0;
        // Recorremos cadas numero en el arreglo
        for(int numero : arreglo){
            if(numero== incognita){
                contar++;
            }
        }
        System.out.println("El numero " + incognita + " aparece" + contar + " veces. ");
    }
 }
 //Ejercicio 10: sumas de opuestos 
 public Ejercicio10 {
    public static void main(String[]arg){
        int[] A ={8,5,3,10,2,8,1};
        int [] B = new int[(A.length + 1)/2];
        //Recorremos el arreglo B para calcular las sumas de los opuestos }
        for(int i =0; i<B.length; i++){
            B[i]=A[i] + A[A.length - 1 - i];
            System.out.print("Arreglo resultante: ");
            for(int numero : B){
                System.out.println(numero + "");
            }
        }
    }
 }
 //Ejercicio 11: Separar negativo, cero y positivo
class Ejercicio11 {
    public static void main(String[]args){
        int[] A= {-3,-1,0,4,6,-2,0,9};
        System.out.print("Negativo: ");
        for(int numero: A){ //Recorremos cada numero en el arreglo
        if(numero < 0){ //Si el numero es menor que 0, es negativo
            System.out.print(numero + ""); 

        }
        System.out.println(); //Salto de linea para separar las secciones 

        }
        System.out.print("Cero: ");
        for(int numero : A){
            System.out.print(numero + " ");

        }
         System.out.println();
    
    }
    System.out.print("Positivo: "); 
    for(int numero: A){
        if(numero > 0){
            System.out.prin(numero + "");
        }
    }
    System.out.println();
}
// Ejercicio 12: Encontrar las pocisiobes de un numero en un arreglo
public class Ejercicio12{
    public static void main(String[]args){
        int[]arreglo = { 4,6,8,2,6,9,6,1};
        int numeroBuscado=6; // El numero que vamos a buscarm
        System.out.print("Posiciones: ");
        for(int i=0;)i< arreglo.length; i++){
            if(arreglo[i]==numeroBuscado){
                System.out.print((i+1)+"");
            }
        }
    }
}
//Ejercicio 13: Separar numeros mayores y menores que la media de un arreglo
public class static void main(String[]args){
    int[]arreglo= {5,8,12,3,7,10};
    double media=0;
    for(int numero : arreglo){
        media += numero;
    }
    media /= arreglo.length;// Calculamos la media dividiendo la suma por la cantidad de elementos
    System.out.println("Media: "+ media);
    System.out.print("Mayores que la media: ");
    for(int numero: arreglo){
        if(numero>media){
            System.out.print(numero+"");
        }
    }
    System.out.print("\nMenores que la media: ");
    for(int numero: arreglo){
        if(numero<media){
            System.out.print(numero+"");
    
     }

    }
    //  Ejercicio 14: Calcular la diferencia de elementos sucesivos en un arreglo
public class Ejercicio14{
    public static void main(String[]arg);
    int[]A = { 4,6,8,2,6,9,5,2};
    int[] B = new int [A.length - 1];
    for(int i=0; < B.length; i++){
        B[i]= A[i+1];
    }
    System.out.print("Arreglo resultante(diferencias sucesivas):");
    for(int numero : B){
        System.out.print(numero + "");
    }

}
//Ejercicio 15: Encontrar el trabajor con el sueldo mas cercano al promedio
public class Ejercicio15{
    public static void main(String[]args){
        String[] nombres = { "Messi", "Ronaldo", "Neymar", "Petro"};// Nombre de los trajadores
        int[] sueldos= { 1000, 1200,1100,1300};// Sueldo de los trabajadores
        int suma =0;
        for(int sueldo: sueldo){
            suma += sueldo;
        }
        double promedio = (double) suma/ sueldo.length; // Operacion para hallar el promedio 
        System.out.println("Sueldo promedio: "+ promedio);
        double diferenciaMinima= Double.MAX_VALUE; //Inicializamos con el valor posible 
        for(int sueldo: sueldo){
            double diferencia = Math.abs(sueldo-promedio);// Calculamos la diferencia en el promedio
            if( diferencia< diferenciaMinima){
                diferenciaMinima=diferencia;
            }
        }
        System.out.print(" Trabajadores con sueldos mas cercanos al promedio: ");
        for(int i=0 i<sueldos.length; i++){
            if(Math.abs(sueldos[i]-promedio)==diferenciaMinima){
                System.out.print(nombres[i]+"");
            }
        }
    }
}
// Ejercicio 16: Informacion de profesores
public class Ejercicio16{
    public static void main(String []args){
        String[]profesores= {"Ana", "Carlos","Marta","Luis"};
        int[] edades={ 45,30,50,40};
        int menor= edades [0], mayor= edades[0];
        String profesorMenor= profesores[0], profesorMayor= profesores[0];
        int suma= 0;
        // Recorremos el arreglo de edades para calcular la suma y encontrar el profesor más joven y más viejo
        for(int i=0; i < edades.length; i++){
            suma += edades[i];
            if(edades [i]< menor){ // Si la edad actual es menor que la menor registrada
                menor= edades[i];
                profesorMenor = profesores[i];
            
            }
            if(edades [i]> mayor){ 
                menor= edades[i];
                profesorMayor = profesores[i];
            
            }
        }
         // Calculamos el promedio de las edades
        double promedio = (double)suma/edades.length;
        System.out.println("Edad promedio: " + promedio);
        System.out.println("Profesor mas joven: " + profesorMenor + " ("menor + "años)" );
         System.out.println("Profesor con mayor edad: " + profesorMayor + " ("mayor + "años)" );
      

}


