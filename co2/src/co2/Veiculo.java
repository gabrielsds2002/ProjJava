package co2;

public class Veiculo {

	    private String tipoVei;
	    protected double km;
	    private double co2Gerado;
	    private String combustivel;

	    public Veiculo() {
	    }

	    public String getTipoVei() {
	        return this.tipoVei;
	    }

	    public void setTipoVei(String tipoVei) {
	        this.tipoVei = tipoVei;
	    }

	    public double getKm() {
	        return this.km;
	    }

	    public void setKM(double km) {
	        this.km = km;
	    }

	    public double getCo2Gerado() {
	        return this.co2Gerado;
	    }

	    public void setCo2Gerado(double co2Gerado) {
	        this.co2Gerado = co2Gerado;
	    }

	    public String getCombustivel() {
	        return this.combustivel;
	    }

	    public void setCombustivel(String combustivel) {
	        this.combustivel = combustivel;
	    }

	    void consumo() {
	    }
	}


