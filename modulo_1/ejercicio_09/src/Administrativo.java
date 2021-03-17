public class Administrativo extends Empleado{

    private boolean presentismo;

    public Administrativo() {
    }

    public Administrativo(String nombre, int legajo, float sueldoBasico, boolean presentismo) {
        super(nombre, legajo, sueldoBasico);
        this.presentismo = presentismo;
    }

    public boolean isPresentismo() {
        return presentismo;
    }

    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }

    @Override
    public float calcularSueldo() {
        return sueldoBasico * ((presentismo)?1.13f:1);
    }

    @Override
    public String toString() {
        return "Tipo de empleado: Administrativo " +
                "presentismo=" + presentismo +
                ", nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldoBasico=" + sueldoBasico +
                ", sueldo=" + this.calcularSueldo();

    }
}
