import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner archivo = new Scanner(new File("CP.txt"));
        Scanner teclado = new Scanner(System.in);
        ArrayList<Localidad> padron = new ArrayList<>();
        archivo.useDelimiter("[;\\n]");

        System.out.println("Ingrese el nombre de la localidad, finalice con .");
        String buscado  = teclado.next().toUpperCase();

        while (archivo.hasNext()){
            String cpLetra = archivo.next();
            int cp = archivo.nextInt();
            String localid = archivo.next();

            Localidad localidad = new Localidad(cpLetra, cp, localid);
            //System.out.printf("%4s %-20d %3s\n", cpLetra,cp,localid);
            padron.add(localidad);

        }
        archivo.close();

        while (!buscado.equals(".")){
            for (Localidad localidad: padron ) {
                String b = localidad.getNombre();
                if(localidad.getNombre().contains(buscado)){
                    System.out.printf("%4s %-20d %3s\n", localidad.getCpLetra(),localidad.getCodPostal(),localidad.getNombre());
                }
            }
            buscado = teclado.next().toUpperCase();
        }
    }
}
