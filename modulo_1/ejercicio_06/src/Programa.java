import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("personas2.txt"));
        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> listaPersona = new ArrayList<>();
        archivo.useDelimiter("[;\\n]");

        int edadMayor = 0;

        Persona personaMayor = null;
        int mayoresDeEdad = 0;
        int cantPerez = 0;

        while (archivo.hasNextInt()){
            int dni = archivo.nextInt();
            String nombre = archivo.next();
            String apellido = archivo.next();
            int edad = archivo.nextInt();

            Persona p = new Persona(dni, nombre, apellido, edad);
            listaPersona.add(p);

        }
        archivo.close();;

        for (Persona persona: listaPersona ) {
            //persona de mayor edad
            if(edadMayor < persona.getEdad()){
                personaMayor = persona;
                edadMayor = persona.getEdad();
            }
            //cantidad de personas de mayor esdad
            if(persona.getEdad()>= 18){
                mayoresDeEdad++;
            }

            //cantidad de apellidos perez
            if(persona.getApellido().equals("PEREZ")){
                cantPerez++;
            }

        }

        System.out.printf("Persona de mayor edad: %4s %-20s\n", personaMayor.getNombre(), personaMayor.getApellido());
        System.out.println("Cantidad de persona mayores de edad:" + mayoresDeEdad);
        System.out.println("Cantidad de persona con apellido PEREZ:" + cantPerez);
    }
}
