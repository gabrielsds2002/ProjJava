package co2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
	
	 public static double soma = 0.0;
	    public String resultadoSoma;
	    private static Veiculo veiculo;
	    private static Moto moto;
	    private static TransportePub transporte;
	    private static Pessoa pessoa;
	    private static final Scanner INPUT;

	    static {
	        INPUT = new Scanner(System.in);
	    }

	    public Principal() {
	    }

	    public static String checarOpcoes(String o1, String o2, String o3, String o4, String txt) {
	        String opcao;
	        do {
	            System.out.printf("%n" + txt);
	            opcao = INPUT.nextLine().toUpperCase();
	        } while(!opcao.contains(o1) && !opcao.contains(o2) && !opcao.contains(o3) && !opcao.contains(o4));

	        return opcao;
	    }

	    public static void cadastro() {
	        pessoa = new Pessoa();
	        System.out.print("Digite seu nome: ");
	        pessoa.setNome(INPUT.nextLine());
	        System.out.print("Qual seu Sexo: ");
	        pessoa.setSexo(INPUT.nextLine());
	        System.out.print("Digite seu CPF: ");
	        pessoa.setCPF(INPUT.nextLine());
	        System.out.print("Digite seu telefone: ");
	        pessoa.setTel(INPUT.nextLine());
	        System.out.print("Digite sua cidade: ");
	        pessoa.setCidade(INPUT.nextLine());
	        System.out.println();
	    }

	    public static boolean meioDeTransp() {
	        MeioDeTransp meioDeTransp = new MeioDeTransp();
	        System.out.printf("Voce usa algum transporte diariamente?%nSim%nNao%n>>> ");
	        meioDeTransp.setUsaTransp(INPUT.nextLine().toUpperCase());
	        return meioDeTransp.isUsaTransp();
	    }

	    public static void dadosVeic() {
	        veiculo = null;
	        String opcao = checarOpcoes("GASOLINA", "FLEX", "ALCOOL", "GNV", "Qual combustivel seu carro usa:%nGasolina <%nFlex\t <%nAlcool\t <%nGNV\t <%n>>> ");
	        if (opcao.contains("GASOLINA")) {
	            veiculo = new CarroGas();
	        } else if (opcao.contains("FLEX")) {
	            veiculo = new CarroFlex();
	        } else if (opcao.contains("ALCOOL")) {
	            veiculo = new CarroAlc();
	        } else {
	            veiculo = new CarroGnv();
	        }

	        veiculo.setTipoVei(checarOpcoes("P", "M", "G", "G", "Qual a pontencia do seu carro:%nP = de 1.0 a 1.4%nM = de 1.5 a 2.0%nG = acima de 2.1%n>>> "));

	        while(true) {
	            try {
	                System.out.print("Quantos KM voce percorre de carro em media por dia: ");
	                veiculo.setKM(INPUT.nextDouble());
	                INPUT.nextLine();
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Valor invalido , digite um Num");
	                INPUT.nextLine();
	            }
	        }

	        veiculo.consumo();
	        System.out.printf("Voce consumiu %.3f kg por dia%n", veiculo.getCo2Gerado());
	    }

	    public static void dadosMoto() {
	        moto = new Moto();
	        moto.setTipoMoto(checarOpcoes("P", "M", "G", "G", "Qual a cilindrada da sua moto:%nP = de 100cc a 250cc%nM = de 350cc a 600cc%nG = acima de 750cc%n>>> "));

	        while(true) {
	            try {
	                System.out.print("Quantos Km voce percorre de moto em media por dia: ");
	                moto.setKMRodado(INPUT.nextDouble());
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Valor invalido , digite um Num");
	                INPUT.nextLine();
	            }
	        }

	        moto.consumoMoto();
	        System.out.printf("Você consumiu %.3f kg por dia%n", moto.getCo2Emit());
	    }

	    public static void dadosTransp() {
	        transporte = new TransportePub();

	        while(true) {
	            try {
	                System.out.print("Quantos Km você percorre de transporte publico em media por dia: ");
	                transporte.setKm(INPUT.nextDouble());
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Valor invalido , digite um Num");
	                INPUT.nextLine();
	            }
	        }

	        transporte.consumoTranportePub();
	        System.out.printf("Voce consumiu %.3f kg por dia%n", transporte.getCo2Gerado());
	        INPUT.nextLine();
	    }

	    public static void main(String[] args) {
	    	cadastro(); 
	    	boolean rodar = meioDeTransp();

	        while(rodar) {
	            System.out.printf("%nQual tipo de veiculo voce usa:%n1 - Carro%n2 - Moto%n3 - Tranporte Publico%n4 - Carro e moto%n5 - Carro e Tranporte Publico%n6 - Moto e Tranporte Publico%n7 - Carro, Moto e Tranporte Publico%n0 - Sair%nEscolha a opcao desejada:%n>>>> ");
	            String opcao = INPUT.nextLine();
	            if (opcao.contains("0")) {
	                break;
	            }

	            if (opcao.contains("1")) {
	                dadosVeic();
	                soma = veiculo.getCo2Gerado();
	            } else if (opcao.contains("2")) {
	                dadosMoto();
	                soma = moto.getCo2Emit();
	            } else if (opcao.contains("3")) {
	                dadosTransp();
	                soma = transporte.getCo2Gerado();
	            } else if (opcao.contains("4")) {
	                dadosVeic();
	                dadosMoto();
	                System.out.printf("Voce consumiu %.3f kg por dia%n", soma = veiculo.getCo2Gerado() + moto.getCo2Emit());
	            } else if (opcao.contains("5")) {
	                dadosVeic();
	                dadosTransp();
	                System.out.println();
	                System.out.printf("Voce consumiu %.3f kg por dia %n", soma = veiculo.getCo2Gerado() + transporte.getCo2Gerado());
	            } else if (opcao.contains("6")) {
	                dadosMoto();
	                dadosTransp();
	                System.out.println();
	                System.out.printf("Voce consumiu %.3f kg por dia %n", soma = moto.getCo2Emit() + transporte.getCo2Gerado());
	            } else if (opcao.contains("7")) {
	                dadosVeic();
	                dadosMoto();
	                dadosTransp();
	                System.out.println();
	                System.out.printf("Voce consumiu %.3f kg por dia %n", soma = moto.getCo2Emit() + veiculo.getCo2Gerado() + transporte.getCo2Gerado());
	            }

	            System.out.println();
	            if (soma == 0) {
	                System.out.println("Parabéns o planeta agradece");
	            } else if (soma > 0 & soma <= 21) {
	                System.out.println("Parabéns você está abaixo da média de consumo, continue assim");
	            } else if (soma >= 22 & soma <= 50) {
	                System.out.println("Você está na media de consumo tente reduzir");
	            } else if (soma >= 50) {
	                System.out.println("Você está acima da média, pense mais no meio ambiente");
	            }

	            System.out.println();
	            if (soma * 365 > 0& soma * 365 <= 5999) {
	                System.out.printf("por ano você consumiu %,.2f  kg %n", soma * 365);
	                System.out.println("Parabéns você está abaixo da média de consumo por ano, continue assim");
	            } else if (soma * 365 >= 6000 & soma * 365 <= 12000) {
	                System.out.printf("por ano você consumiu %,.2f kg %n", soma * 365);
	                System.out.println("Você está na media de consumo por ano tente reduzir");
	            } else if (soma * 365 >= 12001) {
	                System.out.printf("por ano você consumiu %,.2f kg %n", soma * 365);
	                System.out.println("Você está acima da média, pense mais no meio ambiente");
	            }
	        }

	        INPUT.close();
	        System.out.println("Fim do programa.");
	    }

}
