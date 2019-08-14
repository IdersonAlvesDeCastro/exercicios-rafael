package Exercicio03;

import java.util.Date;

public class Comida implements DescontoComida {

	private String nome;
	private double preco;
	private Date dataValidade;

	public Comida(String nome, double preco, Date dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public double valorComDesconto() {
		double valorComDesconto = this.preco /2 ;
		valorComDesconto += 3;
		return valorComDesconto;
	}
	
}
