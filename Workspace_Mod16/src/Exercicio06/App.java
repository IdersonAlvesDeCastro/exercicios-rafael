package Exercicio06;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		// 1) Criar 2 TVs e 2 Radios, as TVs devem comecar no canal 5 e os Radio na
		// estacao 97
		Eletronico Motoradio = new Radio("Motoradio", "Radio", false, 97);
		Eletronico Sharp = new Radio("Sharp", "Radio", false, 97);
		Eletronico Sony = new Televisao("Sony", "Televisao", true, 5);
		Eletronico Panasonic = new Televisao("Panasonic", "Televisao", true, 5);

		// 2) Colocar TVs e Radios em uma mesma Lista
		ArrayList<Eletronico> eletronicos = new ArrayList<Eletronico>();
		eletronicos.add(Motoradio);
		eletronicos.add(Sharp);
		eletronicos.add(Sony);
		eletronicos.add(Panasonic);

		// 3) Fazer um for nesse for fazer as açoes abaixo:
		for (Eletronico eletronico : eletronicos) {

			// 3.1) Ligar o eletronico
			eletronico.ligar();

			// 3.2) Avancar Para o Proximo Canal ou Estacao do Eletronico
			eletronico.avancarParaProximoCanalEstacao();

			// 3.3) Imprimir as 4 informaçoes a seguir: "nome", "tipo", "canal/estacao
			// Atual", "status(ligado ou não)"
			String nome = eletronico.obterNomeEletronico();
			String tipoDoEletronico = eletronico.obterTipoEletronico();
			int canalEstacao = eletronico.obterCanalEstacaoAtual();
			boolean status = eletronico.saberoStatus();

			//System.out.println(nome);
			//System.out.println(tipoDoEletronico);
			//System.out.println(canalEstacao);
			//System.out.println("Status:\t LIGADO");
			//System.out.println("=========================");
		}

		// 4) Fazer um for onde voce deve desligar apenas os eletronicos do tipo "radio"
	
		for (Eletronico eletronico : eletronicos) {
			if (eletronico.obterTipoEletronico().equalsIgnoreCase("Televisao")) {
				eletronico.ligar();
			}

			// 4.1) Imprimir as 4 informaçoes a seguir: "nome", "tipo", "canal/estacao
			// Atual", "status(ligado ou não)"
			String nome = eletronico.obterNomeEletronico();
			String tipoDoEletronico = eletronico.obterTipoEletronico();
			int canalEstacao = eletronico.obterCanalEstacaoAtual();
			boolean status = eletronico.saberoStatus();
			if (eletronico.obterTipoEletronico().equalsIgnoreCase("Televisao")) {
				System.out.println(nome);
				System.out.println(tipoDoEletronico);
				System.out.println(canalEstacao);
				System.out.println("=========================");
			}
		}
	}
}
