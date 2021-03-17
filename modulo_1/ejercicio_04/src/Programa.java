import javax.xml.bind.SchemaOutputResolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        sc.useDelimiter("[,\\n]");//especifica el separador de los registros seria la como el retorno de carro

        int documentoMenor = 0, edadMenor = 0, documentoMayor = 0, edadMayor = 0;
        String nombreMenor = "", nombreMayor = "";


        while (sc.hasNextInt()){ //el primero dice de que tipo es el hasNext
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();


            if (edadMenor == 0 || edad < edadMenor){
                edadMenor = edad;
                nombreMenor = nombre;
                documentoMenor = documento;
            }

            if (edadMayor == 0 || edad > edadMayor){
                edadMayor = edad;
                nombreMayor = nombre;
                documentoMayor = documento;
            }

            System.out.printf("%4d %-20s %3d\n", documento,nombre,edad);

        }

        System.out.printf("El menor es: %4d %-20s %3d\n", documentoMenor,nombreMenor,edadMenor);
        System.out.printf("El mayor es: %4d %-20s %3d\n", documentoMayor,nombreMayor,edadMayor);
    }
}
