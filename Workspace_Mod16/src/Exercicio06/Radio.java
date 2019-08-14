package Exercicio06;

public class Radio implements Eletronico {

	private String nome;
	private String tipoDoEletronico;
	private boolean statusDoEletronico;
	private int canalEstacao;

	public Radio(String nome, String tipoDoEletronico, boolean statusDoEletronico, int canalEstacao) {

		this.nome = nome;
		this.tipoDoEletronico = tipoDoEletronico;
		this.statusDoEletronico = statusDoEletronico;
		this.canalEstacao = canalEstacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDoEletronico() {
		return tipoDoEletronico;
	}

	public void setTipoDoEletronico(String tipoDoEletronico) {
		this.tipoDoEletronico = tipoDoEletronico;
	}

	public boolean isStatusDoEletronico() {
		return statusDoEletronico;
	}

	public void setStatusDoEletronico(boolean statusDoEletronico) {
		this.statusDoEletronico = statusDoEletronico;
	}

	public int getCanalEstacao() {
		return canalEstacao;
	}
	
	public void setCanalEstacao(int canalEstacao) {
		this.canalEstacao = canalEstacao;
	}
	
	public boolean saberoStatus() {
		return statusDoEletronico;
	}
	
	public void ligar() {
		this.statusDoEletronico=true;	
	}
		
	public void desligar() {
		this.statusDoEletronico=false;
	}
	
	public int obterCanalEstacaoAtual() {
			return canalEstacao;
	}
	
	public String obterNomeEletronico() {
		return nome;
	}
	
	public String obterTipoEletronico() {
		return tipoDoEletronico;
	}
	
	public void avancarParaProximoCanalEstacao() {	
		canalEstacao++;
	}
	
	public void voltarParaCanalEstacaoAnterior() {
		canalEstacao--;
	}
}