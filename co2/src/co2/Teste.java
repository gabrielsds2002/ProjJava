package co2;

public class Teste {
	
	    public static void main(String [] args) {
	        conta minhaConta = new conta();
	        minhaConta.saldo = 500.0;
	        conta outraConta = minhaConta;
	        outraConta.saldo += 1000.0;
	        System.out.println(minhaConta.saldo);
	    }
	}


