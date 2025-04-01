public class EjecutarPilaTrabajador{
    public static void main(String[]args){

        StackTrabajador> t= new Stack<>();

        Trabajador t1 = new Trabajador(cedula "1234",nombre:"Juan", salario: 2200.0);
        Trabajador t2 = new Trabajador(cedula "4321",nombre:"Pedro", salario: 3200.0);
        Trabajador t3 = new Trabajador(cedula "3241",nombre:"Luis", salario: 4200.0);
        
        trabajadores.push(t1);
        trabajadores.push(t2);
        trabajadores.push(t3);


        //System.out.println(trabajadores);
       
        System.out.println(trabajadores.size());
 
        double inc = 0.20; //incremento del salario en un 20%
 
        for(int i = 0; i < trabajadores.size(); i++){
            System.out.println("Nombre: " + trabajadores.elementAt(i).getNombre() +
            "Salario inicial: " + trabajadores.elementAt(i).getSalario() +
            "Salario final: " + trabajadores.elementAt(i).pagar(inc) + "\n");
        }
    }
}
 

        
        