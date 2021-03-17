public class CajaAhorro extends  Cuenta{


    public CajaAhorro() {
    }

    public CajaAhorro(int numero, String nombre, double saldo) {
        super(numero, nombre, saldo);
    }

    @Override
    boolean extraer(double extraccion) {
        if(saldo<extraccion){
            return false;
        }else{
            this.saldo = saldo - extraccion;
        }
        return true;
    }

}
