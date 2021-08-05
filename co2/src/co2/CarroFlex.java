package co2;

public class CarroFlex extends Veiculo {
	 private double carroP = 0.350;
	    private double carroM = 0.370;
	    private double carroG = 0.470;

	    public CarroFlex() {
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
