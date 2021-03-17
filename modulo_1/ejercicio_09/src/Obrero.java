public class Obrero extends Empleado{

    private int diasTRabajados;

    public Obrero() { }

    public Obrero(String nombre, int legajo, float sueldoBasico, int diasTRabajados) {
        super(nombre, legajo, sueldoBasico);
        this.diasTRabajados = diasTRabajados;
    }

    public int getDiasTRabajados() {
        return diasTRabajados;
    }

    public void setDiasTRabajados(int diasTRabajados) {
        this.diasTRabajados = diasTRabajados;
    }

    @Override
    public float calcularSueldo() {
        float mntoFijo = this.sueldoBasico/22;
        float sueldo = diasTRabajados * mntoFijo;
        return sueldo;
    }

    @Override
    public String toString() {
        return "Tipo de empleado: Obrero, " +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldoBasico=" + sueldoBasico +
                ", diasTRabajados=" + diasTRabajados +
                ", sueldo=" + this.calcularSueldo();
    }
}
