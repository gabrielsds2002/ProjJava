package co2;

public class TransportePub {
	
	
    double mediaTransp = 0.160;
    private double Km;
    private double Co2Gerado;

    public TransportePub() {
    }

    public double getCo2Gerado() {
        return this.Co2Gerado;
    }

    public void setCo2Gerado(double co2Gerado) {
        this.Co2Gerado = co2Gerado;
    }

    public double getKm() {
        return this.Km;
    }

    public void setKm(double km) {
        this.Km = km;
    }

    void consumoTranportePub() {
        this.getKm();
        this.Co2Gerado = this.mediaTransp * this.getKm();
    }
}
