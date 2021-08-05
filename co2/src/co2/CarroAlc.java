package co2;

public class CarroAlc extends Veiculo {
	private double carroP = 0.330;
    private double carroM = 0.350;
    private double carroG = 0.450;

    public CarroAlc() {
    }

    void consumo() {
        if (this.getTipoVei().contains("P")) {
            this.setCo2Gerado(this.carroP * this.getKm());
        } else if (this.getTipoVei().contains("M")) {
            this.setCo2Gerado(this.carroM * this.getKm());
        } else if (this.getTipoVei().contains("G")) {
            this.setCo2Gerado(this.carroG * this.getKm());
        }

    }

}
