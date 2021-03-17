import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("numeros.txt"));
        int c = 0, suma = 0, menor = 0, cp = 0;

        while (sc.hasNextInt()){
            c++;
            int num = sc.nextInt();
            suma += num;
            if(c == 1 || num < menor){
                menor = num;
            }
            if(num % 2 == 0){
                cp++;
            }

        }
        float promedio = (float) suma / c;

        System.out.println("la suma de todos los numeros es: "+ suma);
        System.out.printf("el promedio de todos los numeros es: %.2f\n", promedio);
        System.out.println("el menor de los numeros es: "+ menor);
        System.out.println("la cantidad de numeros pares es: "+ cp);

        sc.close();

    }
}
