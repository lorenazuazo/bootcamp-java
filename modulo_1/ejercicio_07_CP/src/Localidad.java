public class Localidad {

    private String cpLetra;
    private int codPostal;
    private String nombre;

    public Localidad(String cpLetra, int codPostal, String nombre) {
        this.cpLetra = cpLetra;
        this.codPostal = codPostal;
        this.nombre = nombre;
    }

    public Localidad() { }

    public String getCpLetra() {
        return cpLetra;
    }

    public void setCpLetra(String cpLetra) {
        this.cpLetra = cpLetra;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
