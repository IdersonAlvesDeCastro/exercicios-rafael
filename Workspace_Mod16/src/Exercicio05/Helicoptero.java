package Exercicio05;

public class Helicoptero implements Aeronave {

	private String nome;
	private boolean statusDaAeronave;
	private int numeroDeDecolagens;

	public Helicoptero(String nome, int numeroDeDecolagens) {
		this.nome = nome;
		this.numeroDeDecolagens = numeroDeDecolagens;
	}
	
	public int getNumeroDeDecolagens() {
		return numeroDeDecolagens;
	}
	
	public void setNumeroDeDecolagens(int numeroDeDecolagens) {
		this.numeroDeDecolagens = numeroDeDecolagens;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void decolar() {
		this.statusDaAeronave = true;
		numeroDeDecolagens++;
	}

	public void pousar() {
		this.statusDaAeronave = false;
	}

	public boolean statusDaAeronave() {
		return statusDaAeronave;
	}

	public String obterNome() {
		return nome;
	}
	
	public int obterQuantidadeDecolagens() {
		return numeroDeDecolagens;
		
	}

}
