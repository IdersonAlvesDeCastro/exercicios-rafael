package Exercicio04;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Veiculo Opala = new Carro("GM", "Opala", 2000, " carro ", 20000);
		Veiculo Gol = new Carro("VW", " Gol ", 1600, " carro ", 10000);
		Veiculo RD350 = new Moto("Yamaha", "RD350", 350, " moto ", 9000);
		Veiculo CB400 = new Moto("Honda", "CB400", 400, " moto ", 10000);

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		veiculos.add(Opala);
		veiculos.add(Gol);
		veiculos.add(RD350);
		veiculos.add(CB400);

		for (Veiculo veiculo : veiculos) {
					
			String marca = veiculo.obterMarca();	
			
			veiculo.ligarMotor();
			
			System.out.println(marca);
					
		}

		for (Veiculo veiculo : veiculos) {
			
			
			System.out.println(veiculo.statusDoMotor());
			

		}

	}

}
