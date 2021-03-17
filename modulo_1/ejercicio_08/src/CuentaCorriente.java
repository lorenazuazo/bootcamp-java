public class CuentaCorriente extends Cuenta{

    public float acuerdo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numero, String nombre, double saldo, float acuerdo) {
        super(numero, nombre, saldo);
        this.acuerdo = acuerdo;
    }

    public float getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(float acuerdo) {
        this.acuerdo = acuerdo;
    }

    @Override
    boolean extraer(double extraccion) {
        if((saldo+acuerdo) <= extraccion){
            return false;
        }else{
            setSaldo(getSaldo()-extraccion);
            this.saldo = this.saldo - extraccion;
        }
        return true;
    }


}
