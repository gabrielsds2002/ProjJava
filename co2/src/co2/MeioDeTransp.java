package co2;

public class MeioDeTransp {
	private String usaTransp;

    public MeioDeTransp() {
    }

    public boolean isUsaTransp() {
        if (this.usaTransp.contains("SIM")) {
            return true;
        } else {
            return this.usaTransp.contains("NAO") ? false : false;
        }
    }

    public void setUsaTransp(String usaTransp) {
        this.usaTransp = usaTransp;
    }
}


