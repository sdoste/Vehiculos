public class Vehiculo{
    protected int ruedas;
    protected String motor;
    protected String suspensión;
    protected String marca;
    protected String modelo;
    public Vehiculo(int ruedas, String motor, String suspensión, String marca, String modelo) {
        this.ruedas = ruedas;
        this.motor = motor;
        this.suspensión = suspensión;
        this.marca = marca;
        this.modelo = modelo;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getSuspensión() {
        return suspensión;
    }
    public void setSuspensión(String suspensión) {
        this.suspensión = suspensión;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
}
