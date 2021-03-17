public abstract class Empleado {

    protected String nombre;
    protected int legajo;
    protected  float sueldoBasico;


    public Empleado() { }

    public Empleado(String nombre, int legajo, float sueldoBasico) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldoBasico=" + sueldoBasico +
                '}';
    }

    public abstract float calcularSueldo();
}
