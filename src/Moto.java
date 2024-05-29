public class Moto extends Vehiculo{
    private String manillar;

    public Moto(int ruedas, String motor, String suspensión, String marca, String modelo, String manillar) {
        super(ruedas, motor, suspensión, marca, modelo);
        this.manillar = manillar;
    }

    public String getManillar() {
        return manillar;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    
}
