import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Programa {

    public static void main(String[] args) throws FileNotFoundException {

        ListEmpleados lista = new ListEmpleados();
        Scanner archivo = new Scanner(new File("empleados.txt"));
        archivo.useDelimiter(Pattern.compile("[\\r\\n;]+"));


        while (archivo.hasNextInt()){
            Empleado nuevo = null;
            int tipo = archivo.nextInt();
            int legajo = archivo.nextInt();
            String nombre= archivo.next();
            float sueldo = archivo.nextFloat();
            switch (tipo){
                case 1:
                    int dias = archivo.nextInt();
                    nuevo = new Obrero(nombre,legajo,sueldo,dias);
                    break;
                case  2:
                    boolean presentismo = archivo.nextBoolean();
                    nuevo = new Administrativo(nombre,legajo,sueldo,presentismo);
                    break;
                case 3:
                    float ventas = archivo.nextFloat();
                    nuevo = new Vendedor(nombre,legajo,sueldo,ventas);
                    break;
            }
            lista.agregar(nuevo);
        }

        System.out.printf("El total general en suelados: %15.2f\n",lista.totalSueldos());
        System.out.printf("Total en sueldos para Obreros: %15.2f\n", lista.totalSueldoObreros());
        System.out.printf("Total en sueldos para Administrativo%15.2f\n", lista.totalSueldoAdministrativos());
        System.out.printf("Total en sueldos para Vendedor%15.2f\n",lista.totalSueldoVendedores());
        System.out.println("Empleado que menos cobra\n" + lista.empleadoMenosCobra());
        System.out.printf("Sueldo promedio de un Obrero%15.2f\n",lista.promedioSueldoObreros());
    }

}
