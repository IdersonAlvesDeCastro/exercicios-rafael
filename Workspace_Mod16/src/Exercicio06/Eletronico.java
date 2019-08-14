package Exercicio06;

public interface Eletronico {
	
	boolean saberoStatus();
	void ligar();
	void desligar();
	void avancarParaProximoCanalEstacao();
	void voltarParaCanalEstacaoAnterior();
	int obterCanalEstacaoAtual();
	String obterNomeEletronico();
	String obterTipoEletronico();
		
}
	// Tenho TV e Radio que são do Tipo Eletronico
	// TV -> Eletronico
	// Radio -> Eletronico
	// Toda Eletronico eu posso:
	// - ligar();
	// - desligar();
	// - saberoStatus() //Se esta ligado ou desligado
	// - obterNomeEletronico();
	// - obterTipoEletronico(); // deve retornar "TV" ou "RADIO"
	// - avancarParaProximoCanalEstacao(); //Se estou no nacal 10 deve ir para o 11
	// se estou na estacao 99 deve ir para a 100
	// - voltarParaCanalEstacaoAnterior(); //Se estou no nacal 10 deve ir para o 9
	// se estou na estacao 99 deve ir para a 98
	// - obterCanalEstacaoAtual(); //Obtem o canal da TV ou Estacao do Radio


