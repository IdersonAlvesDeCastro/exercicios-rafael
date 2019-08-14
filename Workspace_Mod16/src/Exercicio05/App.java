package Exercicio05;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		// 1) Criar 2 Avi�es e 2 Helic�pteros
		Aeronave Apache = new Helicoptero("Apache", 0);
		Aeronave Cobra = new Helicoptero("Cobra", 0);
		Aeronave Tucano = new Aviao("Tucano", 0);
		Aeronave Sabre = new Aviao("Sabre", 0);

		// 2) Colocar Avi�es e Helic�pteros em uma mesma Lista
		ArrayList<Aeronave> aeronaves = new ArrayList<Aeronave>();
		aeronaves.add(Apache);
		aeronaves.add(Cobra);
		aeronaves.add(Tucano);
		aeronaves.add(Sabre);

		// 3) Fazer um for e fazer todas aeronaves decolarem
		for (Aeronave aeronave : aeronaves) {
			aeronave.decolar();
			aeronave.pousar();

			aeronave.decolar();
			aeronave.pousar();
			
			aeronave.decolar();
			aeronave.pousar();
		}

		// 7) Fazer um for imprimir o nomeDaAeronave e a quantidadeDecolagens de cada
		// uma delas
		for (Aeronave aeronave : aeronaves) {
			String nome = aeronave.obterNome();
			int quantidadeDeDecolagens = aeronave.obterQuantidadeDecolagens();
			System.out.println(quantidadeDeDecolagens);
			System.out.println(nome);
		}
	}
}
// Informa��es extra sobre o Exercicio
// Tenho Avi�o e Helic�ptero que s�o do Tipo aeronave

// Aviao -> Aeronave
// Helicoptero -> Aeronave

// Toda Aeronave eu posso:
// - Decolar()
// - Pousar()
// - SaberoStatus()
// Se esta voando ou aterrisada
// - obterNomeAeronave();
// - obterQuantidadeDecolagens() //Mostra quantas vezes a aeronave decolou;
