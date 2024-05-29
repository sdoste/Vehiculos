public class Camion extends Vehiculo{
    private float carga;
    private String combustible;

    public Camion(int ruedas, String motor, String suspensión, String marca, String modelo, float carga,
            String combustible) {
        super(ruedas, motor, suspensión, marca, modelo);
        this.carga = carga;
        this.combustible = combustible;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


}
