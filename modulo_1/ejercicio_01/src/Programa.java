import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner datos = new Scanner(new File("numeros.txt"));

        while (datos.hasNextInt()){
            int a = datos.nextInt();
            System.out.println(a);
        }
    }
}
