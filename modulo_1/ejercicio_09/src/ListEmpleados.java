import java.util.ArrayList;

public class ListEmpleados {

    private ArrayList<Empleado> lista = new ArrayList<>();

    public void agregar(Empleado nuevo){
        lista.add(nuevo);
    }

    public float totalSueldos(){
        float total = 0;
        for (Empleado e: lista) {
            total += e.calcularSueldo();
        }
        return total;
    }

    public  float totalSueldoObreros(){
        float total = 0;
        for (Empleado e: lista) {
            if(e instanceof Obrero)
                total += e.calcularSueldo();
        }
        return total;
    }

    public  float totalSueldoAdministrativos(){
        float total = 0;
        for (Empleado e: lista) {
            if(e instanceof Administrativo)
                total += e.calcularSueldo();
        }
        return total;
    }

    public  float totalSueldoVendedores(){
        float total = 0;
        for (Empleado e: lista) {
            if(e instanceof Vendedor)
                total += e.calcularSueldo();
        }
        return total;
    }

    public  Empleado empleadoMenosCobra(){
        Empleado empleado = null;
        for (Empleado e: lista) {
            if(empleado == null || e.calcularSueldo() < empleado.calcularSueldo())
                empleado = e;
        }
        return empleado;
    }

    public  float promedioSueldoObreros(){
        float total = 0;
        int c = 0;
        for (Empleado e: lista) {
            if(e instanceof Obrero)
                total += e.calcularSueldo();
            c++;
        }
        return total/c;
    }

}
