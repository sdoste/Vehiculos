public class Coche extends Vehiculo{
    private int pasajeros;
    private String combustible;
    
    public Coche(int ruedas, String motor, String suspensión, String marca, String modelo, int pasajeros,
            String combustible) {
        super(ruedas, motor, suspensión, marca, modelo);
        this.pasajeros = pasajeros;
        this.combustible = combustible;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    
}
