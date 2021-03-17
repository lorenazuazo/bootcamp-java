public abstract class Cuenta {


    protected int numero;
    protected String nombre;
    protected double saldo;

    public Cuenta() {
    }

    public Cuenta(int numero, String nombre, double saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract boolean extraer(double extraccion);

    String depositar(double deposito) {
        this.saldo = saldo + deposito;
        return "Se realizo con exito el deposito de " + deposito + "su saldo es de " + saldo;
    }
}
