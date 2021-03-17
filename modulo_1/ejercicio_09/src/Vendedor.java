public class Vendedor extends Empleado{

    private float totalVentas;

    public Vendedor() { }

    public Vendedor(String nombre, int legajo, float sueldoBasico, float totalVentas) {
        super(nombre, legajo, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public float calcularSueldo() {
        float comisiones = this.totalVentas * 1 /100;
        float sueldo = this.sueldoBasico + comisiones;
        return sueldo;
    }

    @Override
    public String toString() {
        return "Tipo de empleado: Vendedor " +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", sueldoBasico=" + sueldoBasico +
                ", totalVentas=" + totalVentas +
                ", sueldo=" + this.calcularSueldo();
    }
}
