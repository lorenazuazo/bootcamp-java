import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
      public static void main(String[] args) throws FileNotFoundException {
        //Scanner reader = new Scanner(System.in);
          Scanner reader = new Scanner(new File("casos.txt"));
        ArrayList<Integer> listaNum = new ArrayList<Integer>();
        int num = 0;
        int suma = 0;

        //System.out.println("Ingrese 4 numeros");

        for (int i = 0; i < 4; i++) {
            num = reader.nextInt();
            listaNum.add(num);
        }

          for (Integer numero:listaNum) {
              suma = suma + numero;
          }

          int producto1 = listaNum.get(0) * listaNum.get(1);
          int producto2 = listaNum.get(2) * listaNum.get(3);

          float cociente = (float) producto1 / producto2;

          boolean hayMultiplo = listaNum.get(0) % 3 == 0 || listaNum.get(1) % 3 == 0 || listaNum.get(2) % 3 == 0 || listaNum.get(3) % 3 == 0;

          System.out.println("la suma de los 4 numeros es: "+ suma);
          System.out.println("El producto de los dos primeros es: " + producto1);
          System.out.println("El producto de los otros dos: "+ producto2);
          System.out.printf("El cociente de los dos productos es: %.2f\n", cociente);
          System.out.println(hayMultiplo ? "Hay multipo de 3" : "No hay multiplos de 3");

    }
}
