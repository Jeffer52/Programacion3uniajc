import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        //Menú con opciones 
        do {
            System.out.println("Menu De opciones");
            System.out.println("1. Crear Película");
            System.out.println("2. Asignar Función");
            System.out.println("3. Vender Entradas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {   //El ciclo se cumple hasta que el usuario selecciona la opcion 4.
                case 1:
                    crearPelicula(cine, scanner); //Si opcion es 1, llama al método crearPelicula
                    break;
                case 2:
                    asignarFuncion(cine, scanner); //Si opcion es 2, llama al método asignarFuncion
                    break;
                case 3:
                    venderEntradas(cine, scanner); //Si opcion es 3, llama al método venderEntradas
                    break;
                case 4:
                    System.out.println("Saliendo..."); //Si opcion es 4, muestra un mensaje de salida y luego sale del switch.
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }


    // Métodos para crear películas, asignar funciones y vender entradas
private static void crearPelicula(Cine cine, Scanner scanner) { //Crea una pelicula y la agrega a Cine
        // Lógica para crear una película
        System.out.print("Nombre de la película: ");
        String nombre = scanner.nextLine();
        System.out.print("Idioma: ");
        String idioma = scanner.nextLine();
        System.out.print("Tipo (35mm o 3D): ");
        String tipo = scanner.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Pelicula pelicula = new Pelicula(nombre, idioma, tipo, duracion);//Crea un nuevo objeto Pelicula utilizando el constructor de la clase Pelicula, pasando los valores ingresados por el usuario como argumentos.
        cine.agregarPelicula(pelicula); //Llama al método agregarPelicula del objeto cine para agregar la película recién creada a la lista de películas del cine.
        System.out.println("Película creada con éxito.");
    }


    private static void asignarFuncion(Cine cine, Scanner scanner) {
        // Lógica para asignar una función
        System.out.println("Películas disponibles:"); //Muestra una lista de todas las películas disponibles en el cine.
        for (Pelicula pelicula : cine.getPeliculas()) { //Recorre la lista de películas que se obtiene a través del método 
            System.out.println(pelicula.getNombre()); //imprime el nombre de cada película
        }

        System.out.print("Seleccione una película: ");//Pide al usuario que ingrese el nombre de la película que desea seleccionar.
        String nombrePelicula = scanner.nextLine();// Esta es la entrada, en este caso el nombre de la pelicula 

        Pelicula peliculaSeleccionada = null;
        for (Pelicula pelicula : cine.getPeliculas()) { //Aquí, el código busca en la lista de películas, la película que coincide con el nombre que el usuario ingresó
            if (pelicula.getNombre().equalsIgnoreCase(nombrePelicula)) {//Si la película es encontrada, se asigna a la variable 
                peliculaSeleccionada = pelicula;
                break;
            }
        }

        if (peliculaSeleccionada == null) {
            System.out.println("Película no encontrada.");// si la pelicula sigue sin ser encontrada, entonces se mostrara error 
            return;
        }
        //Muestra todas las salas disponibles en el cine. Para cada sala, se imprime su número y, si la sala es 3D, se indica con "(3D)" al lado del número de la sa
        System.out.println("Salas disponibles:");
        for (Sala sala : cine.getSalas()) {
            System.out.println("Sala " + sala.getNumero() + (sala.isEs3D() ? " (3D)" : ""));
        } 
        //
        System.out.print("Seleccione una sala: ");// Esto sirve ára seleccionar la sala 
        int numeroSala = scanner.nextInt();// Aqui se ingresa la entra el cual va ser el numero de la sala 
        scanner.nextLine(); // el buffer de entrada para evitar problemas con la lectura posterior.

        Sala salaSeleccionada = null;
        for (Sala sala : cine.getSalas()) { //Se busca la sala cuyo número coincide con el número ingresado por el usuario
            if (sala.getNumero() == numeroSala) {// Si se encuentra la sala, se asigna a la variable salaSeleccionada.
                salaSeleccionada = sala;
                break;
            }
        }
        //Si no se encuentra la sala con el número indicado, se muestra un mensaje de error y el método termina.
        if (salaSeleccionada == null) {
            System.out.println("Sala no encontrada.");
            return;
        }
        //Pide al usuario que ingrese un horario para la función (por ejemplo, "14:00", "16:30", "19:00").
        System.out.print("Seleccione un horario (14:00, 16:30, 19:00): ");
        String horario = scanner.nextLine();
        
        Funcion funcion = new Funcion(horario, peliculaSeleccionada, salaSeleccionada); ///Se crea un objeto Funcion con el horario, la película seleccionada y la sala seleccionada.
        cine.agregarFuncion(funcion);//esa función se agrega al cine con el método cine.agregarFuncion(funcion).
        System.out.println("Función asignada con éxito.");// Aqui se muestra un mensaje indicando que la función fue asignada con éxito.
    }
    

    private static void venderEntradas(Cine cine, Scanner scanner) {
       // Se muestra una lista de todas las funciones disponibles en el cine, con el nombre de la película, el número de la sala y el horario de la función.
         System.out.println("Funciones disponibles:");
        for (Funcion funcion : cine.getFunciones()) {
            System.out.println(funcion.getPelicula().getNombre() + " - Sala " + funcion.getSala().getNumero() + " - " + funcion.getHorario());
        }
        //El usuario debe ingresar el nombre de la película, el número de la sala y el horario de la función que desea comprar entradas. Se capturan estas tres variables (nombrePelicula, numeroSala, horario).
        System.out.print("Seleccione una función: ");
        String nombrePelicula = scanner.nextLine();
        System.out.print("Sala: ");
        int numeroSala = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Horario: ");
        String horario = scanner.nextLine();
        //Se busca en la lista de funciones del cine, la función que coincida con los parámetros proporcionados por el usuario: nombre de la película, número de sala y horario.
        Funcion funcionSeleccionada = null;
        for (Funcion funcion : cine.getFunciones()) {
            //Si se encuentra la función que coincide con los datos ingresados, se asigna a la variable funcionSeleccionada.
            if (funcion.getPelicula().getNombre().equalsIgnoreCase(nombrePelicula) && 
                funcion.getSala().getNumero() == numeroSala &&
                funcion.getHorario().equalsIgnoreCase(horario)) {
                funcionSeleccionada = funcion;
                break;
            }
        }
        //Si la función seleccionada es nula , significa que no se encontró una función con esos datos, por lo que se muestra un mensaje de error y el método termina.
        if (funcionSeleccionada == null) {
            System.out.println("Función no encontrada.");
            return;
        }
        //Se muestran los asientos disponibles en la sala de la función seleccionada. Para cada asiento, si no está ocupado (!asiento.isOcupado()), se imprime la fila y el número del asiento.

        System.out.println("Asientos disponibles:");
        for (Asiento asiento : funcionSeleccionada.getSala().getAsientos()) {
            if (!asiento.isOcupado()) {
                System.out.print(asiento.getFila() + asiento.getNumero() + " ");
            }
        }
        System.out.println();
        // Permite al usuario seleccionar asientos disponibles para la función, validando si el asiento es válido y no está ocupado. El proceso se repite hasta que el usuario ingresa 'fin'.

        List<Asiento> asientosSeleccionados = new ArrayList<>();
        while (true) {
            System.out.print("Seleccione un asiento (ej. A1) o 'fin' para terminar: ");
            String seleccion = scanner.nextLine();
            if (seleccion.equalsIgnoreCase("fin")) {
                break;
            }

            String fila = seleccion.substring(0, 1).toUpperCase();
            int numero = Integer.parseInt(seleccion.substring(1));

            Asiento asiento = funcionSeleccionada.getSala().getAsiento(fila, numero);
            if (asiento == null) {
                System.out.println("Asiento no válido.");
            } else if (asiento.isOcupado()) {
                System.out.println("Asiento ya ocupado.");
            } else {
                asiento.ocupar();
                asientosSeleccionados.add(asiento);
                System.out.println("Asiento " + seleccion + " seleccionado.");
            }
        }
        // Crea una venta con los asientos seleccionados y calcula el total a pagar, mostrándolo al usuario.

        Venta venta = new Venta(funcionSeleccionada, asientosSeleccionados);
        System.out.println("Total a pagar: $" + venta.calcularTotal());
    
    }