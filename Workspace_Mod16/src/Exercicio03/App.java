package Exercicio03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {

		Date dataHoje = new Date();

		// 0)criou comida
		Comida arroz = new Comida("Arroz", 20.30, dataHoje);
		arroz.setNome("Arroz com Batata");

		Comida feijao = new Comida("Feijao", 33.67, dataHoje);
		Comida batata = new Comida("Batata", 88.99, dataHoje);

		
		// add na lista de comida
		ArrayList<Comida> listaDeComidas = new ArrayList<Comida>();
		listaDeComidas.add(arroz);
		listaDeComidas.add(feijao);
		listaDeComidas.add(batata);
		// listaDeComidas.add(cebola); //nao pode

		// 1) Calcula total de preco
		double totalPreco = 0;
		for (Comida comida : listaDeComidas) {
			double precoComidaAtual = comida.getPreco();
			String nomeComidaAtual = comida.getNome();
			System.out.println("Estou calculando preco da comida: " + nomeComidaAtual);

			totalPreco += precoComidaAtual;
		}
		System.out.println("TOTAL: " + totalPreco);

		// 2) Mostra o desconto de cada comida
		for (Comida comida : listaDeComidas) {
			double desconto = comida.valorComDesconto();
			String nomeComida = comida.getNome();
			System.out.println("A comida: " + nomeComida + " tem o desconto de: " + desconto);
		}

	}
}
