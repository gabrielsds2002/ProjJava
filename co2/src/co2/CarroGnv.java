package co2;

public class CarroGnv extends Veiculo {
	 private double carroP = 0.260;
	    private double carroM = 0.280;
	    private double carroG = 0.350;

	    public CarroGnv() {
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
