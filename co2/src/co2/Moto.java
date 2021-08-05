package co2;

public class Moto {
	private double kmRodado;
    private String tipoMoto;
    private double co2Emit;
    private double motoP = 0.130;
    private double motoM = 0.210;
    private double motoG = 0.580;

    public Moto() {
    }

    public double getKMRodado() {
        return this.kmRodado;
    }

    public void setKMRodado(double kmRodado) {
        this.kmRodado = kmRodado;
    }

    public String getTipoMoto() {
        return this.tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public double getCo2Emit() {
        return this.co2Emit;
    }

    public void setCo2Emit(double co2Emit) {
        this.co2Emit = co2Emit;
    }

    void consumoMoto() {
        if (this.tipoMoto.contains("P")) {
            this.setCo2Emit(this.motoP * this.getKMRodado());
        } else if (this.tipoMoto.contains("M")) {
            this.setCo2Emit(this.motoM * this.getKMRodado());
        } else if (this.tipoMoto.contains("G")) {
            this.setCo2Emit(this.motoG * this.getKMRodado());
        }

    }

}
